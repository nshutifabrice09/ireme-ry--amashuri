package com.backend.ireme_ry._amashuri.controller;

import com.backend.ireme_ry._amashuri.model.School;
import com.backend.ireme_ry._amashuri.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class SchoolController {

    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @PostMapping("/school")
    public School saveSchool(@RequestBody School school){
        return schoolService.saveSchool(school);
    }
}
