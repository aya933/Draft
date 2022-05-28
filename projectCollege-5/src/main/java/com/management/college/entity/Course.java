package com.management.college.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long courseid;
	 
	@Column ( name = "CourseNAME", nullable = false)
	private String courseNAME;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date courseDate;
	
	@Column (name= "courseTYPE", nullable=false)
	private String courseTYPE;
	
	@Column (name= "Credit", nullable=false)
	private float credit;
	
	@Column (name= "courseSEMESTER",nullable=false)
	private int courseSEMESTER;
	
	@DateTimeFormat (pattern="E, MMM dd yyyy")
	private Date courseTIME;
	

	public Course(String courseNAME, Date courseDate, String courseTYPE, float credit, int courseSEMESTER,
			Date courseTIME) {
		super();
		this.courseNAME = courseNAME;
		this.courseDate = courseDate;
		this.courseTYPE = courseTYPE;
		this.credit = credit;
		this.courseSEMESTER = courseSEMESTER;
		this.courseTIME = courseTIME;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public String getCourseNAME() {
		return courseNAME;
	}

	public void setCourseNAME(String courseNAME) {
		this.courseNAME = courseNAME;
	}

	public Date getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}

	public String getCourseTYPE() {
		return courseTYPE;
	}

	public void setCourseTYPE(String courseTYPE) {
		this.courseTYPE = courseTYPE;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public int getCourseSEMESTER() {
		return courseSEMESTER;
	}

	public void setCourseSEMESTER(int courseSEMESTER) {
		this.courseSEMESTER = courseSEMESTER;
	}

	public Date getCourseTIME() {
		return courseTIME;
	}

	public void setCourseTIME(Date courseTIME) {
		this.courseTIME = courseTIME;
	}
	
	

}