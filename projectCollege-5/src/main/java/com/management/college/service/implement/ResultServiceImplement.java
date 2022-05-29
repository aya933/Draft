package com.management.college.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.Result;
import com.management.college.repository.ResultRepository;
import com.management.college.services.ResultService;

@Service
public class ResultServiceImplement implements ResultService {
private ResultRepository resultRepository;

public ResultServiceImplement(ResultRepository resultRepository) {
	super();
	this.resultRepository = resultRepository;
}

@Override
public List<Result> getAllResults() {
    return resultRepository.findAll();
}

@Override
public Result saveResult(Result result) {
	return resultRepository.save(result);
	
}

@Override
public Result getResultById(Long id) {
	return resultRepository.findById(id).get();
}

@Override
public Result updateResult(Result result) {
	return resultRepository.save(result);
}

@Override
public void deleteResultById(Long id) {
	resultRepository.deleteById(id);	
}

public List<Result> getByKeyword(String keyword){
	return resultRepository.findByKeyword(keyword);
}

}
