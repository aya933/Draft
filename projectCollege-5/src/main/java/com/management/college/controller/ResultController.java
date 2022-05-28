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
import com.management.college.entity.Result;
import com.management.college.entity.Student;
import com.management.college.repository.CourseRepository;
import com.management.college.repository.StudentRepository;
import com.management.college.services.ResultService;



@Controller
public class ResultController {
	
	@Autowired
	private  StudentRepository studentnarep;
	
	@Autowired
	private  CourseRepository coursenarep;
	
	
	
	private ResultService resultService;
	public ResultController(ResultService resultService) {
	    super();
	    this.resultService = resultService;
	}
	
	/* handler
	 * 
	 */
	
	@GetMapping("/results")
	public String listResults(Model model){
		model.addAttribute("results", resultService.getAllResults());
		return "results";
	
}
	
	@GetMapping("/results/new")
	public String createResultForm(Model model){
		List<Student>liststudent= studentnarep.findAll();
		List<Course>listcourse = coursenarep.findAll();
		// create object to hold course form data
		Result result = new Result();
		model.addAttribute("listcourse", listcourse);
		model.addAttribute("liststudent", liststudent);
		model.addAttribute("result", result);
		return "create_result";
		
	}
	
	
	
	@PostMapping("/results")
	public String saveResult(@ModelAttribute("result") Result result) {
		resultService.saveResult(result);
	    return "redirect:/results";
}
	@GetMapping("/results/edit/{resultid}")
	public String editResultForm(@PathVariable Long resultid, Model model) {
		model.addAttribute("result", resultService.getResultById(resultid));
		return "edit_result";
	}
	
	@PostMapping("/results/{resultid}")
	public String updateResult(@PathVariable Long resultid,
			@ModelAttribute("result") Result result,
			Model model) {
		// get from database by id
		Result existingResult = resultService.getResultById(resultid);
		//existingStudent.setStudentid(student.getStudentid());
		existingResult.setResultid(result.getResultid());
		existingResult.setResultSTATE(result.getResultSTATE());
		existingResult.setResultAPPRECIATION(result.getResultAPPRECIATION());
		existingResult.setResultSCORE(result.getResultSCORE());
		existingResult.setResultCOMMENT(result.getResultCOMMENT());
				

		// save updated object
		resultService.updateResult(existingResult);
		return "redirect:/results";		
	}
	
	@GetMapping("/results/{resultid}")
	public String deleteResult(@PathVariable Long resultid) {
		resultService.deleteResultById(resultid);
		return "redirect:/results";
	}
}
