package com.management.college.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.college.entity.Department;
import com.management.college.services.DepartmentService;



@Controller
public class DepartmentController {
	
	
	private DepartmentService departmentService;
	public DepartmentController(DepartmentService departmentService) {
	    super();
	    this.departmentService = departmentService;
	}
	
	/* handler
	 * 
	 */
	
	@GetMapping("/departments")
	public String listDepartments(Model model){
		model.addAttribute("departments", departmentService.getAllDepartments());
		return "departments";
	
}
	
	@GetMapping("/departments/new")
	public String createDepartmentForm(Model model){
		// create object to hold course form data
		Department department = new Department();
		model.addAttribute("department", department);
		return "create_department";
		
	}
	
	
	
	@PostMapping("/departments")
	public String saveDepartment(@ModelAttribute("department") Department department) {
	    departmentService.saveDepartment(department);
	    return "redirect:/departments";
}
	@GetMapping("/departments/edit/{departmentid}")
	public String editDepartmentForm(@PathVariable Long departmentid, Model model) {
		model.addAttribute("department", departmentService.getDepartmentById(departmentid));
		return "edit_department";
	}
	
	@PostMapping("/departments/{departmentid}")
	public String updateDepartment(@PathVariable Long departmentid,
			@ModelAttribute("department") Department department,
			Model model) {
		// get from database by id
		Department existingDepartment = departmentService.getDepartmentById(departmentid);
		//existingStudent.setStudentid(student.getStudentid());
		existingDepartment.setDepartmentid(department.getDepartmentid());
		existingDepartment.setDepartmentNAME(department.getDepartmentNAME());
				

		// save updated object
		departmentService.updateDepartment(existingDepartment);
		return "redirect:/departments";		
	}
	
	@GetMapping("/departments/{departmentid}")
	public String deleteDepartment(@PathVariable Long departmentid) {
		departmentService.deleteDepartmentById(departmentid);
		return "redirect:/departments";
	}
	
	@RequestMapping(path = {"/","/search"})
	public String Department(Department department, Model model, String keyword) {
		if(keyword!=null) {
			List<Department> list = departmentService.getByKeyword(keyword);
			model.addAttribute("list", list);
		}else {
			List<Department> list = departmentService.getAllDepartments();
			model.addAttribute("list", list);}
		return "departments";
	}
	
}

