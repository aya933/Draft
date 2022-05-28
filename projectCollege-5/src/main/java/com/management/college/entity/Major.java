package com.management.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Major")
public class Major {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long majorid;
	
	@Column (name= "majorNAME", nullable=false)
	private String majorNAME;

	public Major(String majorNAME) {
		super();
		this.majorNAME = majorNAME;
	}

	public Major() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getMajorid() {
		return majorid;
	}

	public void setMajorid(Long majorid) {
		this.majorid = majorid;
	}

	public String getMajorNAME() {
		return majorNAME;
	}

	public void setMajorNAME(String majorNAME) {
		this.majorNAME = majorNAME;
	}
	
	

}
