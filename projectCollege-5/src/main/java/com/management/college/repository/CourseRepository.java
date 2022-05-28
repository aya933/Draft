package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
