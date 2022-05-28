package com.management.college.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name= "Teacher")

public class Teacher {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long teacherid;
	 
	@Column ( name = "teacherNAME", nullable = false)
	private String teacherNAME;
	
	@Column ( name = "teacherNUMBER", nullable = false)
	private String teacherNUMBER;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date teacherBIRTH;
	
	@Column (name = "teacherGENDER", nullable=false)
	private String teacherGENDER;
	
	@Column (name = "teacherEMAIL", nullable = false)
	private String teacherEMAIL;
	
	@ManyToOne
	@JoinColumn(name = "coursetaught")
	private Course courseid;
	
	@ManyToOne
	@JoinColumn(name = "departmentname")
	private Department department;

	public Course getCourse() {
		return courseid;
	}

	public void setCourse(Course course) {
		this.courseid = course;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Teacher(String teacherNAME, String teacherNUMBER, Date teacherBIRTH, String teacherGENDER,
			String teacherEMAIL, Course courseid, Department department) {
		super();
		this.teacherNAME = teacherNAME;
		this.teacherNUMBER = teacherNUMBER;
		this.teacherBIRTH = teacherBIRTH;
		this.teacherGENDER = teacherGENDER;
		this.teacherEMAIL = teacherEMAIL;

		this.courseid = courseid;
		this.department = department;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(Long teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeacherNAME() {
		return teacherNAME;
	}

	public void setTeacherNAME(String teacherNAME) {
		this.teacherNAME = teacherNAME;
	}

	public String getTeacherNUMBER() {
		return teacherNUMBER;
	}

	public void setTeacherNUMBER(String teacherNUMBER) {
		this.teacherNUMBER = teacherNUMBER;
	}

	public Date getTeacherBIRTH() {
		return teacherBIRTH;
	}

	public void setTeacherBIRTH(Date teacherBIRTH) {
		this.teacherBIRTH = teacherBIRTH;
	}

	public String getTeacherGENDER() {
		return teacherGENDER;
	}

	public void setTeacherGENDER(String teacherGENDER) {
		this.teacherGENDER = teacherGENDER;
	}

	public String getTeacherEMAIL() {
		return teacherEMAIL;
	}

	public void setTeacherEMAIL(String teacherEMAIL) {
		this.teacherEMAIL = teacherEMAIL;
	}

	public Course getCourseid() {
		return courseid;
	}

	public void setCourseid(Course courseid) {
		this.courseid = courseid;
	}
	
}
	