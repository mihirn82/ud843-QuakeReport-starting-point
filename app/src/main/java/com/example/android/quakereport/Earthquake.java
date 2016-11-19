package com.example.android.quakereport;

/**
 * Created by mihirnewalkar on 11/17/16.
 */

public class Earthquake {

    //Magnitude of the earthquake on Richter scale.
    private double mMagnitude;

    //Nearest city where the earthquake occurred.
    private String mLocation;

    //Date on which the earthquake occurred.
    private long mTimeInMilliseconds;

    //URL for earthquake details.
    private String mUrl;

    /*
    * Create a new Earthquake object.
    *
    *@param magnitude
    *@param location
    *@param date
    * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getUrl() { return mUrl; }
}
