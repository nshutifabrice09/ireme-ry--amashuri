package com.backend.ireme_ry._amashuri.controller;

import com.backend.ireme_ry._amashuri.model.District;
import com.backend.ireme_ry._amashuri.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class DistrictController {

    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @PostMapping("/district")
    public District save(@RequestBody District district){
        return districtService.saveDistrict(district);
    }
}
