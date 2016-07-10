package com.hackathon.transit.starks.dao;

import com.hackathon.transit.routes.model.Route;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StarksDao {
    List getBusListBetweenSourceAndDestination(Double source_lat, Double source_lon,
                                               Double dest_lat, Double dest_lon);
    List<Route> getMockRouteData();
}
