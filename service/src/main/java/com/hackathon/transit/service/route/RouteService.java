package com.hackathon.transit.service.route;


import com.hackathon.transit.service.event.schema.GPSPosition;
import com.hackathon.transit.service.route.schema.Route;
import com.hackathon.transit.service.route.schema.RoutedRequest;

import java.util.List;

/**
 * Created by SAWAI on 7/10/2016.
 */
public interface RouteService {

    List<Route> getRoute(RoutedRequest routedRequest);

    GPSPosition getGPSCordinatesForDestination(String destination);
}
