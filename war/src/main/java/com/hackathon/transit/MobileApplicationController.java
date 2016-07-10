package com.hackathon.transit;

import com.hackathon.transit.service.dao.BusStops;
import com.hackathon.transit.service.event.schema.GPSPosition;
import com.hackathon.transit.service.route.RouteService;
import com.hackathon.transit.service.route.schema.Route;
import com.hackathon.transit.service.route.schema.RoutedRequest;
import com.hackathon.transit.service.util.ServiceUtil;
import com.hackathon.transit.stops.model.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by SAWAI on 7/9/2016.
 */
@Controller
@RequestMapping("/mobile")
public class MobileApplicationController {

    @Autowired
    private BusStops busStops;

    @Autowired
    RouteService routeService;

    @RequestMapping(value = "/pune/bus/stops", method = RequestMethod.GET)
    @ResponseBody
    public String getAvailableStops() {
       List<Stop> busStopsList = busStops.getBusStops();
      //  List<Stop> busStopsList = createBusStops();
        return  ServiceUtil.toJson(busStopsList);
    }

    @RequestMapping(value = "/pune/bus/{busId}/density", method = RequestMethod.GET)
    @ResponseBody
    public Double getBusDensity() {
        Random  random = new Random(System.currentTimeMillis());
        return random.nextDouble()% 100;

    }

    @RequestMapping(value = "/pune/available/routes", method = RequestMethod.GET)
    @ResponseBody
    public String getAvailableRoutes() {
        //  List<Stop> busStopsList = busStops.getBusStops();
        List<Stop> busStopsList = createBusStops();
        return  ServiceUtil.toJson(busStopsList);
    }


    @RequestMapping(value = "/available/routes/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public String getAvailableRoutesForUser(@PathVariable("userId") String userId,
    @RequestParam("latitude") String latitude,
    @RequestParam("longitude") String longitude,
    @RequestParam("destination") String destination,
    @RequestParam("noOfPax") int noOfPax) {
        RoutedRequest routedRequest = new RoutedRequest();
        GPSPosition destinationCordinates = routeService.getGPSCordinatesForDestination(destination);
        routedRequest.setDestination(destinationCordinates);
        routedRequest.setNoOfPax(noOfPax);
        routedRequest.setUserPosition(new GPSPosition(latitude,longitude));
        List<Route> route = routeService.getRoute(routedRequest);
        return  ServiceUtil.toJson(route);
    }



    private List<Stop> createBusStops() {
        List<Stop> stops = new ArrayList<Stop>();
        int i = 1;
        stops.add(getStop(i++));
        stops.add(getStop(i++));
        stops.add(getStop(i++));
        stops.add(getStop(i++));
        stops.add(getStop(i++));
        return stops;
    }

    private Stop getStop(int i) {
        Stop stop = new Stop();
        stop.setStopDesc("stop desc");
        stop.setStopId(101  + i);
        stop.setStopLat(112121.111);
        stop.setStopLon(1212.11);
        stop.setStopName("stop name " + i);
        stop.setStopUrl("some url " + i);
        stop.setZoneId("Zone id");
        return stop;
    }


}
