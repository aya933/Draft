package com.management.college.services;

import java.util.List;

import com.management.college.entity.Course;


public interface CourseService {
	
	List <Course> getAllCourses();
	
    Course saveCourse (Course course);
	
	Course updateCourse(Course course);
	
	void deleteCourseById(Long id);
	
	Course getCourseById(Long id);
	
}
