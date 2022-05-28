package com.management.college.services;

import java.util.List;

import com.management.college.entity.Major;

public interface MajorService {
	
	List<Major> getAllMajors();

	Major saveMajor(Major major);

	Major getMajorById(Long id);

	Major updateMajor(Major major);

	void deleteMajorById(Long id);

}
