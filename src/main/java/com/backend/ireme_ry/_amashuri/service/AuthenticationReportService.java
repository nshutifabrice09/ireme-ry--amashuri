package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;

import java.util.List;

public interface AuthenticationReportService {
    List<AuthenticationReport> getAuthenticationReports();
    AuthenticationReport getAuthenticationReportById(Long id);
    AuthenticationReport saveAuthenticationReport(AuthenticationReport authenticationReport, Long schoolId);
    AuthenticationReport updateAuthenticationReport(Long id, AuthenticationReport authenticationReport);
    void removeAuthenticationReport(Long id);
}
