package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository <District, Long> {
    District findDistrictById(Long id);
}
