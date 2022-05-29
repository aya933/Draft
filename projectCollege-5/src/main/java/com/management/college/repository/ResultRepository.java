package com.management.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.management.college.entity.Result;

public interface ResultRepository extends JpaRepository <Result, Long> {
	
	@Query(value = "select * from Result o where o.resultid like %:keyword% or o.resultCOMMENT like %:keyword% " , nativeQuery = true)
    List<Result> findByKeyword(@Param("keyword") String keyword);

}
