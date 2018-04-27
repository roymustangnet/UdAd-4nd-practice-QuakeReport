package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(earthquake.getDate());
        return listItemView;
    }


}
