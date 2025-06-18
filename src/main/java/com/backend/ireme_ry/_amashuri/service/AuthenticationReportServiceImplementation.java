package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import com.backend.ireme_ry._amashuri.model.School;
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
        return authenticationReportRepository.findAll();
    }

    @Override
    public AuthenticationReport getAuthenticationReportById(Long id) {
        return authenticationReportRepository.findAuthenticationReportById(id);
    }

    @Override
    public AuthenticationReport saveAuthenticationReport(AuthenticationReport authenticationReport, Long schoolId) {
        School school = schoolRepository.findSchoolById(schoolId);
        authenticationReport.setSchool(school);
        return authenticationReportRepository.save(authenticationReport);
    }

    @Override
    public AuthenticationReport updateAuthenticationReport(Long id, AuthenticationReport authenticationReport) {
        AuthenticationReport existAuthenticationReport = authenticationReportRepository.findAuthenticationReportById(id);
        if(existAuthenticationReport != null ){
            existAuthenticationReport.setEvaluatorName(authenticationReport.getEvaluatorName());
            existAuthenticationReport.setSummary(authenticationReport.getSummary());
            existAuthenticationReport.setScore(authenticationReport.getScore());
            existAuthenticationReport.setReportDate(authenticationReport.getReportDate());
            return authenticationReportRepository.save(existAuthenticationReport);
        }
        return null;
    }

    @Override
    public void removeAuthenticationReport(Long id) {
        authenticationReportRepository.deleteById(id);
    }
}
