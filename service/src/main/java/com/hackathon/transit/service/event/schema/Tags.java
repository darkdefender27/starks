package com.hackathon.transit.service.event.schema;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class Tags {
    private String vehicleId;
    private String sensor;
    private String sensorType;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
