package com.management.college.services;

import java.util.List;

import com.management.college.entity.Fee;


public interface FeeService {
	
	List<Fee> getAllFees();

	Fee saveFee(Fee fee);

	Fee getFeeById(Long id);

	Fee updateFee(Fee fee);

	void deleteFeeById(Long id);

}
