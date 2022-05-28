package com.management.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.college.entity.Fee;
import com.management.college.services.FeeService;


@Controller
public class  FeeController {
	
	
	private FeeService feeService;
	public FeeController(FeeService feeService) {
	    super();
	    this.feeService = feeService;
	}
	
	/* handler
	 * 
	 */
	
	@GetMapping("/fees")
	public String listFees(Model model){
		model.addAttribute("fees", feeService.getAllFees());
		return "fees";
	
}
	
	@GetMapping("/fees/new")
	public String createFeeForm(Model model){
		// create object to hold course form data
		Fee fee = new Fee();
		model.addAttribute("fee", fee);
		return "create_fee";
		
	}
	
	
	
	@PostMapping("/fees")
	public String saveFee(@ModelAttribute("fee") Fee fee) {
		feeService.saveFee(fee);
	    return "redirect:/fees";
}
	@GetMapping("/fees/edit/{feeid}")
	public String editFeeForm(@PathVariable Long feeid, Model model) {
		model.addAttribute("fee", feeService.getFeeById(feeid));
		return "edit_fee";
	}
	
	@PostMapping("/courses/{feeid}")
	public String updateFee(@PathVariable Long feeid,
			@ModelAttribute("fee") Fee fee,
			Model model) {
		// get from database by id
		Fee existingFee = feeService.getFeeById(feeid);
		//existingStudent.setStudentid(student.getStudentid());
		existingFee.setFeeid(fee.getFeeid());
		existingFee.setFeeNAME(fee.getFeeNAME());
		existingFee.setFeePRICE(fee.getFeePRICE());
		existingFee.setFeeCOMMENT(fee.getFeeCOMMENT());


		// save updated object
		feeService.updateFee(existingFee);
		return "redirect:/fees";		
	}
	
	@GetMapping("/fees/{feeid}")
	public String deleteFee(@PathVariable Long feeid) {
		feeService.deleteFeeById(feeid);
		return "redirect:/fees";
	}
	
	
	
}