package com.backend.ireme_ry._amashuri.controller;

import com.backend.ireme_ry._amashuri.model.District;
import com.backend.ireme_ry._amashuri.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/districts")
    public List<District> districtList(){
        return districtService.getAllDistricts();
    }

    @GetMapping("/district/{id}")
    public District getDistrict(@PathVariable ("id") Long id){
        return districtService.getDistrictById(id);
    }

    @PutMapping("/update/district/{id}")
    public District updateDistrict(@PathVariable ("id") Long id, @RequestBody District district){
        return districtService.updateDistrict(id, district);

    }

    @DeleteMapping("/delete/district/{id}")
    public void removeDistrict(@PathVariable ("id") Long id){
        districtService.deleteById(id);
    }

}
