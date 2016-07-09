package com.hackathon.transit.agency.bo;

import com.hackathon.transit.agency.model.Agency;
import com.hackathon.transit.stops.model.Stop;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public interface AgencyBo {
    void save(Agency agency);
    void update(Agency agency);
    void delete(Agency agency);
    Agency findByAgencyId(Integer agencyId);
}
