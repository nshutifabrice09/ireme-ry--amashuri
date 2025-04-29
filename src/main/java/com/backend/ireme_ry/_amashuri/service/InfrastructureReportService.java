package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.InfrastructureReport;

import java.util.List;

public interface InfrastructureReportService {
    List<InfrastructureReport> getAllInfrastructureReports();
    InfrastructureReport getInfrastructureReportById(Long id);
    InfrastructureReport saveInfrastructureReport (InfrastructureReport infrastructureReport);
    InfrastructureReport updateInfrastructureReport (Long id, InfrastructureReport infrastructureReport);
    void deleteInfrastructureById (Long id);
}
