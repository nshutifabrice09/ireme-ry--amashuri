package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository <AuthenticationReport, Long> {
}
