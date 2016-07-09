package com.hackathon.transit.agency.dao;

import com.hackathon.transit.agency.model.Agency;
import com.hackathon.transit.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Repository("agencyDao")
public class AgencyDaoImpl extends CustomHibernateDaoSupport implements AgencyDao {

    public void save(Agency agency) {
        getHibernateTemplate().save(agency);
    }

    public void update(Agency agency) {
        getHibernateTemplate().update(agency);
    }

    public void delete(Agency agency) {
        getHibernateTemplate().delete(agency);
    }

    public Agency findByAgencyId(Integer agencyId) {
        List list = getHibernateTemplate().find(
                "from Agency where agencyId = ?", agencyId
        );
        return (Agency)list.get(0);
    }
}
