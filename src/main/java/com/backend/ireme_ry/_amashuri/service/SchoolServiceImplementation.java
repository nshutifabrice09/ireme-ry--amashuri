package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.District;
import com.backend.ireme_ry._amashuri.model.School;
import com.backend.ireme_ry._amashuri.model.User;
import com.backend.ireme_ry._amashuri.repository.DistrictRepository;
import com.backend.ireme_ry._amashuri.repository.SchoolRepository;
import com.backend.ireme_ry._amashuri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImplementation implements SchoolService{
    private final SchoolRepository schoolRepository;
    private final DistrictRepository districtRepository;
    private final UserRepository userRepository;

    @Autowired
    public SchoolServiceImplementation(SchoolRepository schoolRepository, DistrictRepository districtRepository, UserRepository userRepository) {
        this.schoolRepository = schoolRepository;
        this.districtRepository = districtRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(Long id) {
        return schoolRepository.findSchoolById(id);
    }

    @Override
    public School saveSchool(School school, Long districtId, Long headteacherId) {
        District district = districtRepository.findDistrictById(districtId);
        User user = userRepository.findUserById(headteacherId);
        
        return null;
    }

    @Override
    public School updateSchool(Long id, School school) {
        return null;
    }

    @Override
    public void deleteSchoolById(Long id) {
        schoolRepository.deleteById(id);
    }
}
