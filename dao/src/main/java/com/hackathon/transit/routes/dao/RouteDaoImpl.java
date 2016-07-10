package com.hackathon.transit.routes.dao;

import com.hackathon.transit.routes.model.Route;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Repository("routeDao")
public class RouteDaoImpl extends CustomHibernateDaoSupport implements RouteDao {

    public void save(Route route) {
        getHibernateTemplate().save(route);
    }

    public void update(Route route) {
        getHibernateTemplate().update(route);
    }

    public void delete(Route route) {
        getHibernateTemplate().delete(route);
    }

    public List findByRouteId(Integer routeId) {
        List list = getHibernateTemplate().find(
                "from Route where routeId = ?",routeId
        );
        return list;
    }
}