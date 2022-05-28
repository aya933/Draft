package com.management.college.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.Course;
import com.management.college.repository.CourseRepository;
import com.management.college.services.CourseService;
@Service

public class CourseServiceImplement implements CourseService{

private CourseRepository courseRepository;
	
	
	


	public CourseServiceImplement(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}



	@Override
	public List<Course> getAllCourses() {
	 
	    return courseRepository.findAll();
	}
	
	@Override
	
	public Course saveCourse(Course course) {
	    return courseRepository.save(course);
	    
	}



	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}	
	
	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);	
	}
	
	
}

	

