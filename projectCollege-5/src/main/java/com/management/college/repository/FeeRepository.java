package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Fee;

public interface FeeRepository extends JpaRepository<Fee, Long> {

}
