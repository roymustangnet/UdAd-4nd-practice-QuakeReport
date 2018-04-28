package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeListAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeListAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Earthquake earthquake = getItem(i);
        View listItemView = view;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, viewGroup, false);
        }
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(earthquake.getMagnitude());
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(earthquake.getLocation());

        // 根据地震时间（以毫秒为单位）创建一个新的 Date 对象
        Date dateObject = new Date(earthquake.getTimeInMilliseconds());

        // 找到视图 ID 为 date 的 TextView
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // 设置日期字符串的格式（即 "Mar 3, 1984"）
        String formattedDate = formatDate(dateObject);
        // 在该 TextView 中显示目前地震的日期
        dateView.setText(formattedDate);

        // 找到视图 ID 为 time 的 TextView
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // 设置时间字符串的格式（即 "4:30PM"）
        String formattedTime = formatTime(dateObject);
        // 在该 TextView 中显示目前地震的时间
        timeView.setText(formattedTime);
        return listItemView;
    }

    /**
     * 从 Date 对象返回格式化的日期字符串（即 "Mar 3, 1984"）。
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * 从 Date 对象返回格式化的时间字符串（即 "4:30 PM"）。
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
