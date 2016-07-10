package com.hackathon.transit.service.route.schema;

import java.util.List;

/**
 * Created by SAWAI on 7/10/2016.
 */
public class VehiclesRoute {

    private String vehicleType;
    private Double travelCost;
    private long traveltime;
    private List<String> stopNames;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(Double travelCost) {
        this.travelCost = travelCost;
    }


    public long getTraveltime() {
        return traveltime;
    }

    public void setTraveltime(long traveltime) {
        this.traveltime = traveltime;
    }

    public List<String> getStopNames() {
        return stopNames;
    }

    public void setStopNames(List<String> stopNames) {
        this.stopNames = stopNames;
    }
}
