package com.hackathon.transit.routes.bo;

import com.hackathon.transit.routes.dao.RouteDao;
import com.hackathon.transit.routes.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */

@Service("routeBo")
public class RouteBOImpl implements RouteBO {

    @Autowired
    RouteDao routeDao;

    public void setRouteDao(RouteDao routeDao) {
        this.routeDao = routeDao;
    }

    public void save(Route route) {
        routeDao.save(route);
    }

    public void update(Route route) {
        routeDao.update(route);
    }

    public void delete(Route route) {
        routeDao.delete(route);
    }

    public List findByRouteId(Integer routeId) {
        return routeDao.findByRouteId(routeId);
    }
}
