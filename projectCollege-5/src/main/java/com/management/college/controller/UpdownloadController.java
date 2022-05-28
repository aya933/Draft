package com.management.college.controller;


import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.management.college.services.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.management.college.entity.Documents;
import com.management.college.service.implement.UpdownloadService;

@Controller

public class UpdownloadController {
	
	 @Autowired
	 private DocumentsService documentsService;

	@GetMapping("upload-file")
	public String filiers(Model model){

		model.addAttribute("documentsobj",new Documents());
		model.addAttribute("doc",new ArrayList<Documents>());
		model.addAttribute("docs",documentsService.findall());

		return "Updownload";
	}
	@PostMapping("processUpload")
	public String save(@RequestParam("files") MultipartFile fil, Model model) throws IOException {

		//usersService.save(user);
		Documents  files = new Documents();
		byte[] content = fil.getBytes();
		String name = fil.getOriginalFilename();
		String filetype=fil.getContentType();
		files.setContent(content);
		files.setName(name);
		files.setFiletype(filetype);
		documentsService.save(files);
		model.addAttribute("files",files);

		return "redirect:/upload-file";
	}
	@GetMapping("/table")
	public String  table(Model model){
		model.addAttribute("docs",documentsService.findall());
		return "tableetu";
	}
	@GetMapping("/downloadfile")
	public ResponseEntity<byte[]> getFile(@Param("id") Long id ){
		Documents fn = documentsService.getFile(id);
		HttpHeaders header = new HttpHeaders();
		header.add (HttpHeaders.CONTENT_TYPE, fn.getFiletype());
		header. add (HttpHeaders.CONTENT_DISPOSITION, "attachment; filename"+fn.getName());
		return ResponseEntity.ok()
				.headers(header)
				.body(fn.getContent());
	}

	}

