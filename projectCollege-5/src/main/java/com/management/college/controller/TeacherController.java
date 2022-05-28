package com.management.college.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.college.entity.Course;
import com.management.college.entity.Department;
import com.management.college.entity.Teacher;
import com.management.college.repository.CourseRepository;
import com.management.college.repository.DepartmentRepository;
import com.management.college.services.TeacherService;


//@Controller annotation is used to
//mark any java class as a controller class
@Controller

public class TeacherController {
	@Autowired
	private  DepartmentRepository departmentnamerep;
	
	@Autowired
	private  CourseRepository coursetaughtrep;
	
	private TeacherService teacherService;
	public TeacherController(TeacherService teacherService) {
	    super ();
	    this.teacherService = teacherService;
	}
	
	/* handler method
	 * below
	 */
	
	@GetMapping("/teachers")
	public String listTeachers(Model model){
		model.addAttribute("teachers", teacherService.getAllTeachers());
		return "teachers";
	}
	
	@GetMapping("/teachers/new")
	public String createTeacherForm(Model model){
		List<Department>listdepartment = departmentnamerep.findAll();
		List<Course>listcourse = coursetaughtrep.findAll();
		// create student object to hold form data
		Teacher teacher = new Teacher();
		model.addAttribute("teacher", teacher);
		model.addAttribute("listcourse", listcourse);
		model.addAttribute("listdepartment", listdepartment);
		return "create_teacher";
		
	}
	@PostMapping("/teachers")
	public String saveStudent(@ModelAttribute("teacher") Teacher teacher) {
	    teacherService.saveTeacher(teacher);
	    return "redirect:/teachers";
}
	
	@GetMapping("/teachers/edit/{teacherid}")
	public String editTeacherForm(@PathVariable Long teacherid, Model model) {
		model.addAttribute("teacher", teacherService.getTeacherById(teacherid));
		return "edit_teacher";
	}
	
	@PostMapping("/teachers/{teacherid}")
	public String updateTeacher(@PathVariable Long teacherid,
			@ModelAttribute("teacher") Teacher teacher,
			Model model) {

		// get teacher from database by id
		Teacher existingTeacher = teacherService.getTeacherById(teacherid);
		//existingStudent.setStudentid(student.getStudentid());
		existingTeacher.setTeacherid(teacher.getTeacherid());
		existingTeacher.setTeacherNAME(teacher.getTeacherNAME());
		existingTeacher.setTeacherBIRTH(teacher.getTeacherBIRTH());
		existingTeacher.setTeacherGENDER(teacher.getTeacherGENDER());
		existingTeacher.setTeacherEMAIL(teacher.getTeacherEMAIL());
		existingTeacher.setTeacherNUMBER(teacher.getTeacherNUMBER());
		

		// save updated teacher object
		teacherService.updateTeacher(existingTeacher);
		return "redirect:/teachers";		
	}
	
	@GetMapping("/teachers/{teacherid}")
	@RequestMapping(path = {"/","/searchT"})
	public String Teacher(Teacher teacher, Model model, String keyword) {
		if(keyword!=null) {
			List<Teacher> list = teacherService.getByKeyword(keyword);
			model.addAttribute("list", list);
		}else {
			List<Teacher> list = teacherService.getAllTeachers();
			model.addAttribute("list", list);}
		return "teachers";
	}


}
