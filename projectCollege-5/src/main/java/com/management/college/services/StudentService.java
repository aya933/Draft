package com.management.college.services;
import java.util.List;
import java.util.Optional;

import com.management.college.entity.Users;
import org.springframework.data.domain.Page;

import com.management.college.entity.Student;


public interface StudentService {
	
	List <Student> getAllStudents();
	
	Student saveStudent (Student student);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	Student getStudentById(Long id);

	List<Student> getByKeyword(String keyword);
}
