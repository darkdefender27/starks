package com.hackathon.transit.trips.dao;

import com.hackathon.transit.trips.model.Trip;

/**
 * Created by shubhamutwal on 09/07/16.
 */

public interface TripDao {
    void save(Trip trip);
    void update(Trip trip);
    void delete(Trip trip);
    Trip findByTripId(Integer tripId);
}