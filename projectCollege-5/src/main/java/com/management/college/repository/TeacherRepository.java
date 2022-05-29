package com.management.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.management.college.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query(value = "select * from Teacher t where t.teacherid like %:keyword% or t.teacherNAME like %:keyword% " , nativeQuery = true)
    List<Teacher> findByKeyword(@Param("keyword") String keyword);

}