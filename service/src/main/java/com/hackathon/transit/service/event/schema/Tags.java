package com.hackathon.transit.service.event.schema;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class Tags {
    private String bus_id;
    private String sensor;
    private String sensor_type;
    private GPSPosition gpsPosition;

    public GPSPosition getGpsPosition() {
        return gpsPosition;
    }

    public void setGpsPosition(GPSPosition gpsPosition) {
        this.gpsPosition = gpsPosition;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }
}
