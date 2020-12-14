package com.company;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double pLatitude, double pLongitude)
    {
        latitude = pLatitude;
        longitude = pLongitude;
    }

    public String toString()
    {
        return latitude + ", " + longitude;
    }
}
