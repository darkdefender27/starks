package com.hackathon.transit.calendar.dao;

import com.hackathon.transit.agency.model.Agency;
import com.hackathon.transit.calendar.model.Calendar;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface CalendarDao {
    void save(Calendar calendar);
    void update(Calendar calendar);
    void delete(Calendar calendar);
    Calendar findByServiceId(Integer serviceId);
}
