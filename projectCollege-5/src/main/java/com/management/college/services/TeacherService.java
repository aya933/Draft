package com.management.college.services;

import java.util.List;
import com.management.college.entity.Teacher;

public interface TeacherService {
	List <Teacher> getAllTeachers();
	
	Teacher saveTeacher(Teacher teacher);

	Teacher getTeacherById(Long id);
	
	void deleteTeacherById(Long id);

	Teacher updateTeacher(Teacher teacher);
	
	List<Teacher> getByKeyword(String keyword);

}
