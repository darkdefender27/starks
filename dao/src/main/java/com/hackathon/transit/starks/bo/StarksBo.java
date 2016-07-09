package com.hackathon.transit.starks.bo;

import com.hackathon.transit.routes.model.Route;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StarksBo {
    List getBusListBetweenSourceAndDestination(Double source_lat, Double source_lon,
                                               Double dest_lat, Double dest_lon);
    List<Route> getMockRouteData();
}
