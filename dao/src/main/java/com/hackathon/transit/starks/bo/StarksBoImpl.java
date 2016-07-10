package com.hackathon.transit.starks.bo;

import com.hackathon.transit.routes.model.Route;
import com.hackathon.transit.starks.dao.StarksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */

@Service("starksBo")
public class StarksBoImpl implements StarksBo {

    @Autowired
    StarksDao starksDao;

    public void setStarksDao(StarksDao starksDao) {
        this.starksDao = starksDao;
    }


    public List getBusListBetweenSourceAndDestination(Double source_lat, Double source_lon, Double dest_lat, Double dest_lon) {
        return starksDao.getBusListBetweenSourceAndDestination(source_lat, source_lon, dest_lat, dest_lon);
    }

    public List<Route> getMockRouteData() {
        return starksDao.getMockRouteData();
    }
}
