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


    //select route_short_name from routes where route_id =
    // any (
    // select route_id from trips where trip_id =
    // any(
    // select trip_id from stop_times where stop_id =
    // any ( select stop_id from stops where
    // ((stop_lat > 18.5665579874744 and stop_lon > 73.9084024898728)
    // and (stop_lat < 18.4287248157414 and stop_lon < 73.756157988755) )or
    // ((stop_lat < 18.5665579874744 and stop_lon < 73.9084024898728) and
    // (stop_lat > 18.4287248157414 and stop_lon > 73.756157988755)))));

    public Stop findByStopId(Integer stopId) {
        List list = getHibernateTemplate().find(
                "from Stop where stopId = ?",stopId
        );
        return (Stop)list.get(0);
    }

    public List<Stop> findBySrcAndDestLatLong(Double sourceLat, Double sourceLon, Double destLat, Double destLon) {
        List list = getHibernateTemplate().find(
                "from Stop where stop_lat between 18.4287248157414 and 18.5665579874744 and stop_lon between 73.756157988755 and 73.9084024898728 "
        );
        System.out.println(((Stop)list.get(0)).getStopId());
        return list;
    }

    public List<Stop> getBusStops() {
        return getHibernateTemplate().find("from Stop");
    }
}
