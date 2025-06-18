package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationReportRepository extends JpaRepository <AuthenticationReport, Long> {
    AuthenticationReport findAuthenticationReportById(Long id);
}
