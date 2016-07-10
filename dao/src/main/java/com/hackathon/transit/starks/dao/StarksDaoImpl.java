package com.hackathon.transit.starks.dao;

import com.hackathon.transit.routes.bo.RouteBO;
import com.hackathon.transit.routes.model.Route;
import com.hackathon.transit.stops.bo.StopBo;
import com.hackathon.transit.stoptime.bo.StopTimeBo;
import com.hackathon.transit.trips.bo.TripBo;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Component("starksDao")
public class StarksDaoImpl extends CustomHibernateDaoSupport implements StarksDao {

    @Autowired
    RouteBO routeBO;

    @Autowired
    StopBo stopBo;

    @Autowired
    TripBo tripBo;

    @Autowired
    StopTimeBo stopTimeBo;

    public void setRouteBO(RouteBO routeBO) {
        this.routeBO = routeBO;
    }

    public void setStopBo(StopBo stopBo) {
        this.stopBo = stopBo;
    }

    public void setTripBo(TripBo tripBo) {
        this.tripBo = tripBo;
    }

    public void setStopTimeBo(StopTimeBo stopTimeBo) {
        this.stopTimeBo = stopTimeBo;
    }

    public List getBusListBetweenSourceAndDestination(Double source_lat, Double source_lon, Double dest_lat, Double dest_lon) {

        return getHibernateTemplate().find(
                "from Route r where r.routeId = any(" +
                        "select t.routeId from Trip t where t.tripId = any(" +
                        "select st.tripId from StopTime st where st.stopId = any(" +
                        "select s.stopId from Stop s where s.stopLat " +
                        "between ?  and ? and s.stopLon " +
                        "between ? and ?)))", source_lat, source_lon, dest_lat, dest_lon
        );
    }

    public List<Route> getMockRouteData() {
        List<Route> mockRouteList = new ArrayList<Route>();
        String str[] = {"201",
                "291",
                "204",
                "7",
                "207",
                "148",
                "21",
                "184",
                "11K",
                "38",
                "301K",
                "292R",
                "292A",
                "103",
                "31",
                "1S",
                "3S",
                "5",
                "13L",
                "30",
                "115P",
                "145",
                "146",
                "163",
                "170",
                "174",
                "187C",
                "203P",
                "4S",
                "5S",
                "123",
                "139A"
        };

        for (String aStr : str) {
            Route route = new Route();
            route.setRouteShortName(aStr);
            mockRouteList.add(route);
        }

        return mockRouteList;
    }
}