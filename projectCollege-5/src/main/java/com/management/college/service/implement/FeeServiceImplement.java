package com.management.college.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.Fee;
import com.management.college.repository.FeeRepository;
import com.management.college.services.FeeService;


@Service

public class FeeServiceImplement implements FeeService {
	
	private FeeRepository feeRepository;
	

	public FeeServiceImplement(FeeRepository feeRepository) {
		super();
		this.feeRepository = feeRepository;
	}

	@Override
	public List<Fee> getAllFees() {
		return feeRepository.findAll();
	}

	@Override
	public Fee saveFee(Fee fee) {
		return feeRepository.save(fee);
	}

	@Override
	public Fee getFeeById(Long id) {
		return feeRepository.findById(id).get();
	}

	@Override
	public Fee updateFee(Fee fee) {
		return  feeRepository.save(fee);
	}

	@Override
	public void deleteFeeById(Long id) {
		feeRepository.deleteById(id);	
		
	}

}

