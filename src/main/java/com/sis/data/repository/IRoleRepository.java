 package com.sis.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sis.data.entity.ERole;
import com.sis.data.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findByname(ERole name);
}
