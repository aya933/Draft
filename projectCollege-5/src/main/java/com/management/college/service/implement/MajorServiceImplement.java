package com.management.college.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.Major;
import com.management.college.repository.MajorRepository;
import com.management.college.services.MajorService;

@Service

public class MajorServiceImplement implements MajorService {
	
	private MajorRepository majorRepository;
	

	public MajorServiceImplement(MajorRepository majorRepository) {
		super();
		this.majorRepository = majorRepository;
	}

	@Override
	public List<Major> getAllMajors() {
		return majorRepository.findAll();
	}

	@Override
	public Major saveMajor(Major major) {
		return majorRepository.save(major);
	}

	@Override
	public Major getMajorById(Long id) {
		return majorRepository.findById(id).get();
	}

	@Override
	public Major updateMajor(Major major) {
		return  majorRepository.save(major);
	}

	@Override
	public void deleteMajorById(Long id) {
		majorRepository.deleteById(id);	
		
	}

}
