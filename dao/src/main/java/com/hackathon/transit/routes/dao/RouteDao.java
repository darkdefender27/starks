package com.hackathon.transit.routes.dao;

import com.hackathon.transit.routes.model.Route;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */

public interface RouteDao {
    void save(Route route);
    void update(Route route);
    void delete(Route route);
    List findByRouteId(Integer routeId);
}