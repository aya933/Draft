package com.management.college.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import com.management.college.entity.Student;



//@Repository annotation is used to
//indicate that the class provides the mechanism
//for storage, retrieval, search,update and delete
//operation on objects.



public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query(value = "select * FROM u WHERE u.studentid like %:keyword% or u.studentNAME like %:keyword%", nativeQuery = true)
	 List<Student> findByKeyword(@Param("keyword") String keyword);
}