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

//Entity annotation defines that a
//class can be mapped to a table
@Entity

//@Table annotation defines name of the table
@Table(name="Student")
public class Student {
	
	 // @Id annotation specifies the
  // primary key of an entity
	@Id
	
	 // @GeneratedValue annotation Provides for the
  // specification of generation strategies
  // for the values of primary keys
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long studentid;
	 
	
	// @Column annotation specifies
  // the name of the column
	@Column ( name = "studentNAME", nullable = false)
	private String studentNAME;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date studentBIRTH;
	
	@Column (name= "studentNUMBER", nullable=false)
	private String studentNUMBER;
	
	@Column (name= "studentGENDER", nullable=false)
	private String studentGENDER;

	@Column (name="studentEMAIL", nullable = false)
	private String studentEMAIL;

	
	//JPA Hibernate brings specific info
	//from different Tables to the current Table
	@ManyToOne
	@JoinColumn(name = "majorNAME")
	private Major major;

	

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentNAME, Date studentBIRTH, String studentNUMBER, String studentGENDER,
			String studentEMAIL, String studentPASSWORD, Major major) {
		super();
		this.studentNAME = studentNAME;
		this.studentBIRTH = studentBIRTH;
		this.studentNUMBER = studentNUMBER;
		this.studentGENDER = studentGENDER;
		this.studentEMAIL = studentEMAIL;
		this.major = major;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getStudentNAME() {
		return studentNAME;
	}

	public void setStudentNAME(String studentNAME) {
		this.studentNAME = studentNAME;
	}

	public Date getStudentBIRTH() {
		return studentBIRTH;
	}

	public void setStudentBIRTH(Date studentBIRTH) {
		this.studentBIRTH = studentBIRTH;
	}

	public String getStudentNUMBER() {
		return studentNUMBER;
	}

	public void setStudentNUMBER(String studentNUMBER) {
		this.studentNUMBER = studentNUMBER;
	}

	public String getStudentGENDER() {
		return studentGENDER;
	}

	public void setStudentGENDER(String studentGENDER) {
		this.studentGENDER = studentGENDER;
	}

	public String getStudentEMAIL() {
		return studentEMAIL;
	}

	public void setStudentEMAIL(String studentEMAIL) {
		this.studentEMAIL = studentEMAIL;
	}

	
}