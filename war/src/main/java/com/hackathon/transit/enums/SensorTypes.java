package com.hackathon.transit.enums;

/**
 * Created by SAWAI on 7/9/2016.
 */
public enum  SensorTypes {
    BUS_DENSITY("bus_density"),
    ROAD_DENSITY("road_density");

    private String value = null;
    SensorTypes(String sensorType) {
        this.value = sensorType;
    }

}
