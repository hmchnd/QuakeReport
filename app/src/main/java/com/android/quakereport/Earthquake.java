package com.android.quakereport;

import android.os.AsyncTask;

import java.util.List;

public class Earthquake {
    /** Magnitude of the earthquake */
    private double mMagnitude;
    /*Location of earth quake*/
    private String mLocation;
    /*Date of the earth quake*/
    private String mDate;
private String mUrl;


    /** Time of the earthquake */
    private long mTimeInMilliseconds;




    /*
    * Construct a new Earthquake object
    * @param magnitude
    * @param location
    * @param date
    * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /*
    * Return the magnitude of earth quake.
    * */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /*
    * Return the location of earth  quake.
    * */
    public String getmLocation() {
        return mLocation;
    }

    /*
    * Return the date of earth quake.
    *
    * */

    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }



}
