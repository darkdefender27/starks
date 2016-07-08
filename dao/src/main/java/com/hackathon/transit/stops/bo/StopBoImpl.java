package com.hackathon.transit.stops.bo;

import com.hackathon.transit.stops.dao.StopDao;
import com.hackathon.transit.stops.model.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Service("stopBo")
public class StopBoImpl implements StopBo {

    @Autowired
    StopDao stopDao;

    public void setStopDao(StopDao stopDao) {
        this.stopDao = stopDao;
    }

    public void save(Stop stop) {
        stopDao.save(stop);
    }

    public void update(Stop stop) {
        stopDao.update(stop);
    }

    public void delete(Stop stop) {
        stopDao.delete(stop);
    }

    public Stop findByStopId(Integer stopId) {
        return stopDao.findByStopId(stopId);
    }
}
