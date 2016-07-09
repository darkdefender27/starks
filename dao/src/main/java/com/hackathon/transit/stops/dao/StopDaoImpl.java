package com.hackathon.transit.stops.dao;

import com.hackathon.transit.stops.model.Stop;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */

@Repository("stopDao")
public class StopDaoImpl extends CustomHibernateDaoSupport implements StopDao {

    public void save(Stop stop) {
        getHibernateTemplate().save(stop);
    }

    public void update(Stop stop) {
        getHibernateTemplate().update(stop);
    }

    public void delete(Stop stop) {
        getHibernateTemplate().delete(stop);
    }

    public Stop findByStopId(Integer stopId) {
        List list = getHibernateTemplate().find(
                "from Stop where stopId = ?",stopId
        );
        return (Stop)list.get(0);
    }

    public List<Stop> getBusStops() {
        List<Stop> list = getHibernateTemplate().find("from stops");
        return list;
    }
}
