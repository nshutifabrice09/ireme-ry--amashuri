package com.backend.ireme_ry._amashuri.controller;

import com.backend.ireme_ry._amashuri.model.School;
import com.backend.ireme_ry._amashuri.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SchoolController {

    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }


    @GetMapping("/schools")
    public List <School> schoolList(){
        return schoolService.getAllSchools();
    }

    @GetMapping("/school/{id}")
    public School getSchoolById(@PathVariable ("id") Long id){
        return schoolService.getSchoolById(id);
    }

    @PutMapping("/update/school/{id}")
    public School updateSchool (@PathVariable ("id") Long id, @RequestBody School school){
        return schoolService.updateSchool(id, school);
    }

    @DeleteMapping("/delete/school/{id}")
    public void deleteSchoolById(@PathVariable ("id") Long id){
        schoolService.deleteSchoolById(id);
    }
}
