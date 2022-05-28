package com.management.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long departmentid;
	
	@Column (name= "departmentNAME", nullable=false)
	private String departmentNAME;
	
	

	public Department(String departmentNAME) {
		super();
		this.departmentNAME = departmentNAME;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentNAME() {
		return departmentNAME;
	}

	public void setDepartmentNAME(String departmentNAME) {
		this.departmentNAME = departmentNAME;
	}
	
	

}
