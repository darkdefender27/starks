package com.hackathon.transit.stoptime.bo;

import com.hackathon.transit.stoptime.model.StopTime;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StopTimeBo {

    void save(StopTime stopTime);
    void update(StopTime stopTi);
    void delete(StopTime stopTi);
    StopTime findByTripId(Integer tripId);
}
