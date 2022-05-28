package com.management.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.college.entity.Major;
import com.management.college.services.MajorService;



@Controller
public class  MajorController {
	
	
	private MajorService majorService;
	public MajorController(MajorService majorService) {
	    super();
	    this.majorService = majorService;
	}
	
	/* handler
	 * 
	 */
	
	@GetMapping("/majors")
	public String listMajors(Model model){
		model.addAttribute("majors", majorService.getAllMajors());
		return "majors";
	
}
	
	@GetMapping("/majors/new")
	public String createMajorForm(Model model){
		// create object to hold course form data
		Major major = new Major();
		model.addAttribute("major", major);
		return "create_major";
		
	}
	
	
	
	@PostMapping("/majors")
	public String saveMajor(@ModelAttribute("major") Major major) {
	    majorService.saveMajor(major);
	    return "redirect:/majors";
}
	@GetMapping("/majors/edit/{majorid}")
	public String editMajorForm(@PathVariable Long majorid, Model model) {
		model.addAttribute("major", majorService.getMajorById(majorid));
		return "edit_major";
	}
	
	@PostMapping("/courses/{majorid}")
	public String updateMajor(@PathVariable Long majorid,
			@ModelAttribute("department") Major major,
			Model model) {
		// get from database by id
		Major existingMajor = majorService.getMajorById(majorid);
		//existingStudent.setStudentid(student.getStudentid());
		existingMajor.setMajorid(major.getMajorid());
		existingMajor.setMajorNAME(major.getMajorNAME());
				

		// save updated object
		majorService.updateMajor(existingMajor);
		return "redirect:/majors";		
	}
	
	@GetMapping("/majors/{majorid}")
	public String deleteMajor(@PathVariable Long majorid) {
		majorService.deleteMajorById(majorid);
		return "redirect:/majors";
	}
	
	
	
}

