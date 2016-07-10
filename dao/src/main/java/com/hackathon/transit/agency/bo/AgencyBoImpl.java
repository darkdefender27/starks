package com.hackathon.transit.agency.bo;

import com.hackathon.transit.agency.dao.AgencyDao;
import com.hackathon.transit.agency.model.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Service("agencyBo")
public class AgencyBoImpl implements AgencyBo {

    @Autowired
    AgencyDao agencyDao;

    public void setAgencyDao(AgencyDao agencyDao) {
        this.agencyDao = agencyDao;
    }

    public void save(Agency agency) {
        agencyDao.save(agency);
    }

    public void update(Agency agency) {
        agencyDao.update(agency);
    }

    public void delete(Agency agency) {
        agencyDao.delete(agency);
    }

    public Agency findByAgencyId(Integer agencyId) {
        return agencyDao.findByAgencyId(agencyId);
    }
}