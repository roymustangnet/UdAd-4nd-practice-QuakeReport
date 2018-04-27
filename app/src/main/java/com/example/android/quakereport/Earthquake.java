package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String magnitude, String location, String date){
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }

    public String getMagnitude(){return this.mMagnitude;}
    public String getLocation(){return this.mLocation;}
    public String getDate(){return this.mDate;}
}
