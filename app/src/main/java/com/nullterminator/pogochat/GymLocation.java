package com.nullterminator.pogochat;

/**
 * Created by Rayun on 2016-07-17.
 */
public class GymLocation {
    private double _lat, _long;

    public GymLocation() {
    }

    public GymLocation(double _lat, double _long) {
        this._lat = _lat;
        this._long = _long;
    }

    public double getLat() {
        return _lat;
    }

    public void setLat(double val) {
        this._lat = val;
    }

    public double getLong() {
        return _long;
    }

    public void setLong(double val) {
        this._long = _long;
    }
}
