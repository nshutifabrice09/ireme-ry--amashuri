package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.InfrastructureReport;
import com.backend.ireme_ry._amashuri.repository.InfrastructureReportRepository;
import com.backend.ireme_ry._amashuri.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfrastructureReportServiceImplementation implements InfrastructureReportService{

    private final InfrastructureReportRepository infrastructureReportRepository;
    private final SchoolRepository schoolRepository;

    @Autowired
    public InfrastructureReportServiceImplementation(InfrastructureReportRepository infrastructureReportRepository, SchoolRepository schoolRepository) {
        this.infrastructureReportRepository = infrastructureReportRepository;
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<InfrastructureReport> getAllInfrastructureReports() {
        return null;
    }

    @Override
    public InfrastructureReport getInfrastructureReportById(Long id) {
        return null;
    }

    @Override
    public InfrastructureReport saveInfrastructureReport(InfrastructureReport infrastructureReport, Long schoolId) {
        return null;
    }

    @Override
    public InfrastructureReport updateInfrastructureReport(Long id, InfrastructureReport infrastructureReport) {
        return null;
    }

    @Override
    public void deleteInfrastructureById(Long id) {

    }
}
