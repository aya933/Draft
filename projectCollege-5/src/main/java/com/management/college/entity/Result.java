package com.management.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Result")
public class Result {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long resultid;
	
	@Column (name= "resultSTATE", nullable=false)
	private String resultSTATE;
	
	@Column (name= "resultSCORE", nullable=false)
	private String resultSCORE;
	
	@Column (name= "resultAPPRECIATION", nullable=false)
	private String resultAPPRECIATION;
	
	@Column (name= "resultCOMMENT", nullable=false)
	private String resultCOMMENT;
	
	@ManyToOne
	@JoinColumn(name = "studentname")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "coursename")
	private Course course;
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Result(String resultSTATE, String resultSCORE, String resultAPPRECIATION, String resultCOMMENT) {
		super();
		this.resultSTATE = resultSTATE;
		this.resultSCORE = resultSCORE;
		this.resultAPPRECIATION = resultAPPRECIATION;
		this.resultCOMMENT = resultCOMMENT;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getResultid() {
		return resultid;
	}

	public void setResultid(Long resultid) {
		this.resultid = resultid;
	}

	public String getResultSTATE() {
		return resultSTATE;
	}

	public void setResultSTATE(String resultSTATE) {
		this.resultSTATE = resultSTATE;
	}

	public String getResultSCORE() {
		return resultSCORE;
	}

	public void setResultSCORE(String resultSCORE) {
		this.resultSCORE = resultSCORE;
	}

	public String getResultAPPRECIATION() {
		return resultAPPRECIATION;
	}

	public void setResultAPPRECIATION(String resultAPPRECIATION) {
		this.resultAPPRECIATION = resultAPPRECIATION;
	}

	public String getResultCOMMENT() {
		return resultCOMMENT;
	}

	public void setResultCOMMENT(String resultCOMMENT) {
		this.resultCOMMENT = resultCOMMENT;
	}

	
}
