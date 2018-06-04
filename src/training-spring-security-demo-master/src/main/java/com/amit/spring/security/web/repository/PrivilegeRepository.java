package com.amit.spring.security.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.spring.security.web.entity.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {


}
