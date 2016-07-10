package com.hackathon.transit.trips.bo;

import com.hackathon.transit.trips.dao.TripDao;
import com.hackathon.transit.trips.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Service("tripBo")
public class TripBoImpl implements TripBo {

    @Autowired
    TripDao tripDao;

    public void setTripDao(TripDao tripDao) {
        this.tripDao = tripDao;
    }

    public void save(Trip trip) {
        tripDao.save(trip);
    }

    public void update(Trip trip) {
        tripDao.update(trip);
    }

    public void delete(Trip trip) {
        tripDao.delete(trip);
    }

    public List findByTripId(Integer tripId) {
        return tripDao.findByTripId(tripId);
    }
}
