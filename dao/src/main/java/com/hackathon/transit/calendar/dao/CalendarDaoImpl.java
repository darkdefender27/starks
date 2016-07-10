package com.hackathon.transit.calendar.dao;

import com.hackathon.transit.agency.model.Agency;
import com.hackathon.transit.calendar.model.Calendar;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Repository("calendarDao")
public class CalendarDaoImpl extends CustomHibernateDaoSupport implements CalendarDao {

    public void save(Calendar calendar) {
        getHibernateTemplate().save(calendar);
    }

    public void update(Calendar calendar) {
        getHibernateTemplate().update(calendar);
    }

    public void delete(Calendar calendar) {
        getHibernateTemplate().delete(calendar);
    }

    public Calendar findByServiceId(Integer serviceId) {
        List list = getHibernateTemplate().find(
                "from Calendar where serviceId = ?", serviceId
        );
        return (Calendar)list.get(0);
    }
}