package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds){
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude(){return this.mMagnitude;}
    public String getLocation(){return this.mLocation;}
    public long getTimeInMilliseconds(){ return this.mTimeInMilliseconds; }
}
