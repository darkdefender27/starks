package com.hackathon.transit.stoptime.dao;

import com.hackathon.transit.stoptime.model.StopTime;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Repository("stopTimeDao")
public class StopTimeDaoImpl extends CustomHibernateDaoSupport implements StopTimeDao {

    public void save(StopTime stopTime) {
        getHibernateTemplate().save(stopTime);
    }

    public void update(StopTime stopTime) {
        getHibernateTemplate().update(stopTime);
    }

    public void delete(StopTime stopTime) {
        getHibernateTemplate().delete(stopTime);
    }

    public StopTime findByTripId(Integer tripId) {
        List list = getHibernateTemplate().find(
                "from StopTime where tripId = ?", tripId
        );
        return (StopTime) list.get(0);
    }
}
