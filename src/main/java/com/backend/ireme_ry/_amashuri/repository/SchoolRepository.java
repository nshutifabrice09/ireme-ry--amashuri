package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository <School, Long> {
    School findSchoolById(Long id);
}
