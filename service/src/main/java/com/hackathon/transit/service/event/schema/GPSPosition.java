package com.hackathon.transit.service.event.schema;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class GPSPosition {
    private String longitude;
    private String latitude;

    public GPSPosition() {

    }
    public GPSPosition(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
