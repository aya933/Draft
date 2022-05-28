package com.management.college.services;

import java.util.List;

import com.management.college.entity.Department;

public interface DepartmentService {
	
	List<Department> getAllDepartments();

	Department saveDepartment(Department department);

	Department getDepartmentById(Long id);

	Department updateDepartment(Department department);

	void deleteDepartmentById(Long id);
	
	List<Department> getByKeyword(String keyword);

}
