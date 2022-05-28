package com.management.college.services;

import java.util.List;

import com.management.college.entity.Result;


public interface ResultService {
	
List <Result> getAllResults();
	
	Result saveResult(Result result);

	Result getResultById(Long id);
	
	void deleteResultById(Long id);

	Result updateResult(Result result);

}
