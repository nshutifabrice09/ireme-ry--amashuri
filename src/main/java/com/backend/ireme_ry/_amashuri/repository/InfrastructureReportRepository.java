package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.InfrastructureReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfrastructureReportRepository extends JpaRepository <InfrastructureReport, Long> {
}
