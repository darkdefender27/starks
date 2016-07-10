package com.hackathon.transit.agency.dao;

import com.hackathon.transit.agency.model.Agency;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface AgencyDao {
    void save(Agency agency);
    void update(Agency agency);
    void delete(Agency agency);
    Agency findByAgencyId(Integer agencyId);
}
