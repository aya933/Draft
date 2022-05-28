package com.management.college.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.college.entity.Department;
import com.management.college.repository.DepartmentRepository;
import com.management.college.services.DepartmentService;



@Service

public class DepartmentServiceImplement implements DepartmentService {
	
	private DepartmentRepository departmentRepository;
	
	

	public DepartmentServiceImplement(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartmentById(Long id) {
		departmentRepository.deleteById(id);	
		
	}
	
	public List<Department> getByKeyword(String keyword){
		return departmentRepository.findByKeyword(keyword);
	}
	
	

}
