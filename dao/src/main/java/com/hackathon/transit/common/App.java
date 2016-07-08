package com.hackathon.transit.common;

import com.hackathon.transit.routes.bo.RouteBO;
import com.hackathon.transit.routes.model.Route;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        RouteBO routeBo = (RouteBO) appContext.getBean("routeBo");

        Route route = routeBo.findByRouteId(703);
        System.out.println("Found route: " + route.toString());

        System.out.println("Done");
    }
}