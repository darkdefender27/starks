package com.hackathon.transit.trips.dao;

import com.hackathon.transit.trips.model.Trip;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Repository("tripDao")
public class TripDaoImpl extends CustomHibernateDaoSupport implements TripDao {

    public void save(Trip trip) {
        getHibernateTemplate().save(trip);
    }

    public void update(Trip trip) {
        getHibernateTemplate().update(trip);
    }

    public void delete(Trip trip) {
        getHibernateTemplate().delete(trip);
    }

    public Trip findByTripId(Integer tripId) {
        List list = getHibernateTemplate().find(
                "from Trip where tripId = ?", tripId
        );
        return (Trip)list.get(0);
    }
}