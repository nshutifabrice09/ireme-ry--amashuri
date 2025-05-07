package com.backend.ireme_ry._amashuri.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthenticationReportDto {
    private Long id;
    private Long schoolId;
    private String evaluatorName;
    private String summary;
    private int score;
    private LocalDate reportDate;

}
