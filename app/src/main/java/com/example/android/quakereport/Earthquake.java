package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, long timeInMilliseconds){
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude(){return this.mMagnitude;}
    public String getLocation(){return this.mLocation;}
    public long getTimeInMilliseconds(){ return this.mTimeInMilliseconds; }
}
