package com.hackathon.transit.stoptime.dao;

import com.hackathon.transit.stoptime.model.StopTime;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StopTimeDao {
    void save(StopTime stopTime);
    void update(StopTime stopTime);
    void delete(StopTime stopTime);
    StopTime findByTripId(Integer tripId);
}
