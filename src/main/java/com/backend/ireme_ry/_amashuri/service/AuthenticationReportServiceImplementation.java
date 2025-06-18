package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import com.backend.ireme_ry._amashuri.repository.AuthenticationReportRepository;
import com.backend.ireme_ry._amashuri.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationReportServiceImplementation implements AuthenticationReportService{

    private final AuthenticationReportRepository authenticationReportRepository;
    private final SchoolRepository schoolRepository;

    @Autowired
    public AuthenticationReportServiceImplementation(AuthenticationReportRepository authenticationReportRepository, SchoolRepository schoolRepository) {
        this.authenticationReportRepository = authenticationReportRepository;
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<AuthenticationReport> getAuthenticationReports() {
        return null;
    }

    @Override
    public AuthenticationReport getAuthenticationReportById(Long id) {
        return null;
    }

    @Override
    public AuthenticationReport saveAuthenticationReport(AuthenticationReport authenticationReport, Long schoolId) {
        return null;
    }

    @Override
    public AuthenticationReport updateAuthenticationReport(Long id, AuthenticationReport authenticationReport) {
        return null;
    }

    @Override
    public void removeAuthenticationReport(Long id) {

    }
}
