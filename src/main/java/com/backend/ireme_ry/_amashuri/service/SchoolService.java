package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.School;

import java.util.List;

public interface SchoolService {
    List<School> getAllSchools();
    School getSchoolById(Long id);
    School saveSchool (School school, Long districtId, Long headteacherId);
    School updateSchool (Long id, School school);
    void deleteSchoolById(Long id);
}
