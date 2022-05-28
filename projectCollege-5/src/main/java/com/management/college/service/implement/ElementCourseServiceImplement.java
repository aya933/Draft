package com.management.college.service.implement;
import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.ElementCourse;
import com.management.college.repository.ElementCourseRepository;
import com.management.college.services.ElementCourseService;




@Service

public class ElementCourseServiceImplement implements ElementCourseService  {
private ElementCourseRepository elementcourseRepository;
	
	
	


	public ElementCourseServiceImplement(ElementCourseRepository elementcourseRepository) {
		super();
		this.elementcourseRepository = elementcourseRepository;
	}





	@Override
	public List<ElementCourse> getAllElementCourse() {
	 
	    return  elementcourseRepository.findAll();
	}





@Override
	
	public ElementCourse saveElementCourse(ElementCourse elementcourse) {
	    return elementcourseRepository.save(elementcourse);
	    
	}



	@Override
	public ElementCourse getElementCourseById(Long id) {
		return elementcourseRepository.findById(id).get();
	}

	@Override
	public ElementCourse updateElementCourse(ElementCourse elementcourse) {
		return elementcourseRepository.save(elementcourse);
	}	
	
	@Override
	public void deleteElementCourseById(Long id) {
		elementcourseRepository.deleteById(id);	
	}

	
	
}
