package com.hackathon.transit.trips.bo;

import com.hackathon.transit.trips.model.Trip;

/**
 * Created by shubhamutwal on 09/07/16.
 */

public interface TripBo {
    void save(Trip trip);
    void update(Trip trip);
    void delete(Trip trip);
    Trip findByTripId(Integer tripId);
}
