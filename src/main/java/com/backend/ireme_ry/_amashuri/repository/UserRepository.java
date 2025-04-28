package com.backend.ireme_ry._amashuri.repository;

import com.backend.ireme_ry._amashuri.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
