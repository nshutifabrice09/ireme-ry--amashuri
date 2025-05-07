package com.backend.ireme_ry._amashuri.mapper;

import com.backend.ireme_ry._amashuri.dto.AuthenticationReportDto;
import com.backend.ireme_ry._amashuri.model.AuthenticationReport;
import com.backend.ireme_ry._amashuri.model.School;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationReportMapper {
    public AuthenticationReportDto toDto(AuthenticationReport report) {
        AuthenticationReportDto dto = new AuthenticationReportDto();

        return dto;
    }

    public AuthenticationReport toEntity(AuthenticationReportDto dto, School school) {
        AuthenticationReport report = new AuthenticationReport();

        return report;
    }
}
