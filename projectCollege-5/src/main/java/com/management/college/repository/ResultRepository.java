package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Result;

public interface ResultRepository extends JpaRepository <Result, Long> {

}
