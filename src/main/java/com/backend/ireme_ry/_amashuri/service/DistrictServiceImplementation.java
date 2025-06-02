package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.District;
import com.backend.ireme_ry._amashuri.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImplementation implements DistrictService{

    private final DistrictRepository districtRepository;

    @Autowired
    public DistrictServiceImplementation(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public List<District> getAllDistricts() {
        return districtRepository.findAll();
    }

    @Override
    public District getDistrictById(Long id) {
        return districtRepository.findDistrictById(id);
    }

    @Override
    public District saveDistrict(District district) {
        return districtRepository.save(district);
    }

    @Override
    public District updateDistrict(Long id, District district) {
        District existDistrict = districtRepository.findDistrictById(id);
        if(existDistrict != null){
            existDistrict.setName(district.getName());
            existDistrict.setProvince(district.getProvince());
            return districtRepository.save(existDistrict);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        districtRepository.deleteById(id);
    }
}
