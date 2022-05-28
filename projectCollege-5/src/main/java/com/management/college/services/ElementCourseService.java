package com.management.college.services;

import java.util.List;

import com.management.college.entity.ElementCourse;

public interface ElementCourseService {
	List <ElementCourse> getAllElementCourse();
	
	ElementCourse saveElementCourse (ElementCourse elementcourse);
	
	ElementCourse updateElementCourse(ElementCourse elementcourse);
	
	void deleteElementCourseById(Long id);
	
	ElementCourse getElementCourseById(Long id);

}
