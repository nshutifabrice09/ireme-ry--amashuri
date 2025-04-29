package com.backend.ireme_ry._amashuri.controller;

import com.backend.ireme_ry._amashuri.model.InfrastructureReport;
import com.backend.ireme_ry._amashuri.service.InfrastructureReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class InfrastructureReportController {

    private final InfrastructureReportService infrastructureReportService;

    @Autowired
    public InfrastructureReportController (InfrastructureReportService infrastructureReportService){
        this.infrastructureReportService = infrastructureReportService;
    }

    @PostMapping("/infrastructureReport")
    public InfrastructureReport saveInfrastructureReport(@RequestBody InfrastructureReport infrastructureReport){
        return infrastructureReportService.saveInfrastructureReport(infrastructureReport);
    }

    @GetMapping("/infrastructureReports")
    public List<InfrastructureReport> infrastructureReportList(){
        return infrastructureReportService.getAllInfrastructureReports();
    }

    @GetMapping("/infrastructureReport/{id}")
    public InfrastructureReport getInfrastructureReportById(@PathVariable ("id") Long id){
        return infrastructureReportService.getInfrastructureReportById(id);
    }

    @PutMapping("/update/infrastructureReport/{id}")
    public InfrastructureReport updateInfrastructureReport(@PathVariable ("id") Long id, @RequestBody InfrastructureReport infrastructureReport){
        return infrastructureReportService.updateInfrastructureReport(id, infrastructureReport);
    }

    @DeleteMapping("/delete/infrastructureReports/{id}")
    public void deleteInfrastructureById(@PathVariable ("id") Long id){
        infrastructureReportService.deleteInfrastructureById(id);
    }

}
