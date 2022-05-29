package com.management.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.management.college.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	@Query(value = "select * from Course c where c.courseid like %:keyword% or c.CourseNAME like %:keyword% or c.courseTYPE like %:keyword%" , nativeQuery = true)
	 List<Course> findByKeyword(@Param("keyword") String keyword);

}
