package com.hackathon.transit.calendar.bo;

import com.hackathon.transit.calendar.dao.CalendarDao;
import com.hackathon.transit.calendar.model.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Service("calendarBo")
public class CalendarBoImpl implements CalendarBo {

    @Autowired
    CalendarDao calendarDao;

    public void setCalendarDao(CalendarDao calendarDao) {
        this.calendarDao = calendarDao;
    }

    public void save(Calendar calendar) {
        calendarDao.save(calendar);
    }

    public void update(Calendar calendar) {
        calendarDao.update(calendar);
    }

    public void delete(Calendar calendar) {
        calendarDao.delete(calendar);
    }

    public Calendar findByServiceId(Integer serviceId) {
        return calendarDao.findByServiceId(serviceId);
    }
}