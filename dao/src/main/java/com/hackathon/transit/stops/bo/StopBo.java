package com.hackathon.transit.stops.bo;

import com.hackathon.transit.stops.model.Stop;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface StopBo {
    void save(Stop stop);
    void update(Stop stop);
    void delete(Stop stop);
    Stop findByStopId(Integer stopId);
}
