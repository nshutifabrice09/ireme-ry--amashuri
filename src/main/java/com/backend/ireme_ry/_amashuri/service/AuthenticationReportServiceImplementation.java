package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationReportServiceImplementation implements AuthenticationReportService{
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
