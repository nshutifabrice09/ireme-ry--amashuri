package com.backend.ireme_ry._amashuri.mapper;

import com.backend.ireme_ry._amashuri.dto.SchoolDto;
import com.backend.ireme_ry._amashuri.model.School;
import org.springframework.stereotype.Component;

@Component
public class SchoolMapper {

    public SchoolDto toDto(School school) {
        SchoolDto dto = new SchoolDto();

        return dto;
    }

    public School toEntity(SchoolDto dto) {
        School school = new School();

        return school;
    }
}
