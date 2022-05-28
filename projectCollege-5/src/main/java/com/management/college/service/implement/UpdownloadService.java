package com.management.college.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.college.entity.Documents;
import com.management.college.repository.UpdownloadRepository;

@Service
public class UpdownloadService {
	
	@Autowired
	
	private UpdownloadRepository repository;
	public Documents createUpdownload(Documents updownload) {
		return repository.save(updownload);
	}
	
	public List<Documents> getAllUpdownload(){
		  return repository.findAll();
		  
		 }
		 
		 public Optional<Documents> findUpdownloadById(long id){
		  return repository.findById(id);
		 }
		}


