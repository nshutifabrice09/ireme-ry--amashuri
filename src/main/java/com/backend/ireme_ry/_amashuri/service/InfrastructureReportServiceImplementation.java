package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.InfrastructureReport;
import com.backend.ireme_ry._amashuri.model.School;
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
        return infrastructureReportRepository.findAll();
    }

    @Override
    public InfrastructureReport getInfrastructureReportById(Long id) {
        return infrastructureReportRepository.findInfrastructureReportById(id);
    }

    @Override
    public InfrastructureReport saveInfrastructureReport(InfrastructureReport infrastructureReport, Long schoolId) {
        School school = schoolRepository.findSchoolById(schoolId);
        infrastructureReport.setSchool(school);
        return infrastructureReportRepository.save(infrastructureReport);
    }

    @Override
    public InfrastructureReport updateInfrastructureReport(Long id, InfrastructureReport infrastructureReport) {
        InfrastructureReport existIfInfrastructureReport = infrastructureReportRepository.findInfrastructureReportById(id);
            if (existIfInfrastructureReport != null) {
                existIfInfrastructureReport.setHasElectricity(infrastructureReport.isHasElectricity());
                existIfInfrastructureReport.setHasInternet(infrastructureReport.isHasInternet());
                existIfInfrastructureReport.setNumberOfClassrooms(infrastructureReport.getNumberOfClassrooms());
                existIfInfrastructureReport.setNumberOfComputers(infrastructureReport.getNumberOfComputers());
                existIfInfrastructureReport.setCleanWaterAvailable(infrastructureReport.isCleanWaterAvailable());
                existIfInfrastructureReport.setToiletsAvailable(infrastructureReport.isToiletsAvailable());
                return infrastructureReportRepository.save(existIfInfrastructureReport);
            }
        return null;
    }
    @Override
    public void deleteInfrastructureById(Long id) {
        infrastructureReportRepository.deleteById(id);
    }
}
