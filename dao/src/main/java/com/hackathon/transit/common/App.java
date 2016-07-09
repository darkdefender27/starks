package com.hackathon.transit.common;

import com.hackathon.transit.starks.bo.StarksBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        Double sourceLat = 18.4287248157414;
        Double sourceLon = 18.5665579874744;

        Double destLat = 73.756157988755;
        Double destLon = 73.9084024898728;

        StarksBo starksBo = (StarksBo) appContext.getBean("starksBo");
        List routeList = starksBo.getBusListBetweenSourceAndDestination(sourceLat, sourceLon, destLat, destLon);
        for (Object route : routeList) {
            System.out.println("Route: " + route);
        }

        System.out.println("Done!");
    }
}