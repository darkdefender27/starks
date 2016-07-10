package com.hackathon.transit.stoptime.bo;

import com.hackathon.transit.stoptime.dao.StopTimeDao;
import com.hackathon.transit.stoptime.model.StopTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Service("stopTimeBo")
public class StopTimeBoImpl implements StopTimeBo {

    @Autowired
    StopTimeDao stopTimeDao;

    public void save(StopTime stopTime) {
        stopTimeDao.save(stopTime);
    }

    public void update(StopTime stopTi) {
        stopTimeDao.update(stopTi);
    }

    public void delete(StopTime stopTi) {
        stopTimeDao.delete(stopTi);
    }

    public StopTime findByTripId(Integer tripId) {
        return stopTimeDao.findByTripId(tripId);
    }

    public List findByStopId(Integer stopId) {
        return stopTimeDao.findByStopId(stopId);
    }
}

