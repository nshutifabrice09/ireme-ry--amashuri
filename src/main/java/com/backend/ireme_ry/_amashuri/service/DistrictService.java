package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.District;

import java.util.List;

public interface DistrictService {
    List<District> getAllDistricts();
    District getDistrictById(Long id);
    District saveDistrict(District district);
    District updateDistrict(Long id, District district);

    void deleteById(Long id);
}
