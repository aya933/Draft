package com.management.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.college.entity.Course;
import com.management.college.entity.ElementCourse;
import com.management.college.entity.Student;
import com.management.college.entity.Teacher;
import com.management.college.repository.CourseRepository;
import com.management.college.repository.StudentRepository;
import com.management.college.repository.TeacherRepository;
import com.management.college.services.ElementCourseService;

@Controller
public class ElementCourseController {
	
	@Autowired
	private CourseRepository courseidrep;
	
	@Autowired
	private TeacherRepository teachernamerep;
	
	@Autowired
	private StudentRepository studentnarep;
	
	
	private ElementCourseService elementcourseService;
	public ElementCourseController(ElementCourseService elementcourseService) {
	    super();
	    this.elementcourseService = elementcourseService;
	}
	
	/* handler method
	 * below
	 */
	
	@GetMapping("/elementcourses")
	public String listElementCourses(Model model){
		model.addAttribute("elementcourses", elementcourseService.getAllElementCourse());
		return "elementcourses";
	
}
	
	
	
	@GetMapping("/elementcourses/new")
	public String createElementCourseForm(Model model){
		
		List<Course>listcourse =  courseidrep.findAll();
		List<Teacher>listteacher =  teachernamerep.findAll();
		List<Student>liststudent = studentnarep.findAll();
				
		// create course object to hold course element form data
		ElementCourse elementcourse = new ElementCourse();
		model.addAttribute("elementcourse", elementcourse);
		model.addAttribute("listcourse", listcourse);
		model.addAttribute("listteacher", listteacher);
		model.addAttribute("liststudent", liststudent);
		return "create_elementcourse";
	}
	
	@PostMapping("/elementcourses")
	public String saveElementCourse(@ModelAttribute("elementcourse") ElementCourse elementcourse) {
	    elementcourseService.saveElementCourse(elementcourse);
	    return "redirect:/elementcourses";
}
	@GetMapping("/elementcourses/edit/{elementcourseid}")
	public String editElementCourseForm(@PathVariable Long elementcourseid, Model model) {
		model.addAttribute("elementcourse", elementcourseService.getElementCourseById(elementcourseid));
		return "edit_elementcourse";
	}
	
	@PostMapping("/elementcourses/{elementcourseid}")
	public String updateElementCourse(@PathVariable Long elementcourseid,
			@ModelAttribute("elementcourse") ElementCourse elementcourse,
			Model model) {
		// get element from database by id
		//Student existingStudent = studentService.getStudentById(id);
		ElementCourse existingElementCourse = elementcourseService.getElementCourseById(elementcourseid);
		//existingStudent.setStudentid(student.getStudentid());
		existingElementCourse.setElementcourseid(elementcourse.getElementcourseid());
		existingElementCourse.setElementcourseNAME(elementcourse.getElementcourseNAME());
		existingElementCourse.setElementcoursePERCENTAGE(elementcourse.getElementcoursePERCENTAGE());
		existingElementCourse.setElementcourseSCORE(elementcourse.getElementcourseSCORE());
		

		// save updated course object
		elementcourseService.updateElementCourse(existingElementCourse);
		return "redirect:/elementcourses";		
	}
	
	@GetMapping("/elementcourses/{elementcourseid}")
	public String deleteElementCourse(@PathVariable Long elementcourseid) {
		elementcourseService.deleteElementCourseById(elementcourseid);
		return "redirect:/elementcourses";
	}
	
	
}
