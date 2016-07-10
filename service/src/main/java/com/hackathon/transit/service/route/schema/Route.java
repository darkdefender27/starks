package com.hackathon.transit.service.route.schema;

import java.util.List;

/**
 * Created by SAWAI on 7/10/2016.
 */
public class Route {

    private List<VehiclesRoute> vehiclesRouteList;

    public List<VehiclesRoute> getVehiclesRouteList() {
        return vehiclesRouteList;
    }

    public void setVehiclesRouteList(List<VehiclesRoute> vehiclesRouteList) {
        this.vehiclesRouteList = vehiclesRouteList;
    }
}
