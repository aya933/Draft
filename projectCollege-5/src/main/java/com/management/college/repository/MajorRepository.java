package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Major;

public interface MajorRepository extends JpaRepository<Major, Long> {

}
