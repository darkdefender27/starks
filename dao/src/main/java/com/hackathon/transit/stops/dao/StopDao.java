package com.hackathon.transit.stops.dao;

import com.hackathon.transit.stops.model.Stop;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StopDao {
    void save(Stop stop);
    void update(Stop stop);
    void delete(Stop stop);
    Stop findByStopId(Integer stopId);

    List<Stop> getBusStops();
}