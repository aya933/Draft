package com.management.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.management.college.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Query(value = "select * from Department d where d.departmentNAME like %:keyword% or d.departmentid like %:keyword%", nativeQuery = true)
    List<Department> findByKeyword(@Param("keyword") String keyword);


}
