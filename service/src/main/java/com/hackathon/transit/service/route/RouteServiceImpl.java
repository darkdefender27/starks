package com.hackathon.transit.service.route;

import com.hackathon.transit.service.event.schema.GPSPosition;
import com.hackathon.transit.service.route.schema.Route;
import com.hackathon.transit.service.route.schema.RoutedRequest;
import com.hackathon.transit.service.route.schema.VehiclesRoute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SAWAI on 7/10/2016.
 */
public class RouteServiceImpl implements RouteService {

    public static final String BUS = "BUS";
    public static final String WALK = "WALK";
    public static final String AUTO = "AUTO";

    public List<Route> getRoute(RoutedRequest routedRequest) {
        List<Route> routeList = new ArrayList<Route>();
        routeList.add(createRoute());
        routeList.add(createRoute());
        routeList.add(createRoute());
        return routeList;
    }

    public GPSPosition getGPSCordinatesForDestination(String destination) {
        return new GPSPosition("1234.12", "456.72");
    }

    private Route createRoute() {
        Route route = new Route();
        List<VehiclesRoute> vehiclesRoutes = new ArrayList<VehiclesRoute>();
        vehiclesRoutes.add(createVehicleRoute(BUS));
        vehiclesRoutes.add(createVehicleRoute(WALK));
        vehiclesRoutes.add(createVehicleRoute(AUTO));
        route.setVehiclesRouteList(vehiclesRoutes);
        return route;
    }

    private VehiclesRoute createVehicleRoute(String vehicleType) {
        VehiclesRoute vehiclesRoute = new VehiclesRoute();
        vehiclesRoute.setVehicleType(vehicleType);
        if(vehicleType.equals(BUS)) {
            vehiclesRoute.setStopNames(getStopNames());
        }
        if(!vehicleType.equals(WALK)) {
            vehiclesRoute.setTravelCost(100d);
        }
        vehiclesRoute.setTraveltime(25);
        return vehiclesRoute;
    }

    public List<String> getStopNames() {
        return Arrays.asList("Stop 1","Stop 2","Stop 3","Stop4");
    }
}
