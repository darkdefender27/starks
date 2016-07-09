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


    public List findByStopId(Integer stopId) {
        /*List list = getHibernateTemplate().find(
                "from Stop where stopId = ?",stopId
        );
        return (Stop)list.get(0);*/
        List list = getHibernateTemplate().find(
                "from StopTime where stopId = ?", stopId
        );
        return list;
    }

}
