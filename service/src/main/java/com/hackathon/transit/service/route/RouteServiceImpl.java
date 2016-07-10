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
        return new GPSPosition("18.5814977204538", "73.8155293361879");
    }

    private Route createRoute() {
        Route route = new Route();
        List<VehiclesRoute> vehiclesRoutes = new ArrayList<VehiclesRoute>();
        VehiclesRoute vehicleRoute1 = createVehicleRoute(AUTO);
        vehicleRoute1.setTraveltime(2);
        vehicleRoute1.setTravelCost(20d);

        VehiclesRoute vehicleRoute2 = createVehicleRoute(BUS);
        vehicleRoute2.setTraveltime(50);
        vehicleRoute2.setTravelCost(26d);

        VehiclesRoute vehicleRoute3 = createVehicleRoute(AUTO);
        vehicleRoute3.setTraveltime(6);
        vehicleRoute3.setTravelCost(35d);
        vehiclesRoutes.add(vehicleRoute1);
        vehiclesRoutes.add(vehicleRoute2);
        vehiclesRoutes.add(vehicleRoute3);
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
        return Arrays.asList("Rajgurunagar Vidyalaya","Bharat English School");
    }
}
