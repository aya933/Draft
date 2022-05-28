package com.management.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fee")
public class Fee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long feeid;
	
	@Column (name= "feeNAME", nullable=false)
	private String feeNAME;
	
	@Column (name= "feePRICE", nullable=false)
	private int feePRICE;
	
	@Column (name= "feeCOMMENT", nullable=false)
	private String feeCOMMENT;

	public Fee(String feeNAME, int feePRICE, String feeCOMMENT) {
		super();
		this.feeNAME = feeNAME;
		this.feePRICE = feePRICE;
		this.feeCOMMENT = feeCOMMENT;
	}

	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getFeeid() {
		return feeid;
	}

	public void setFeeid(Long feeid) {
		this.feeid = feeid;
	}

	public String getFeeNAME() {
		return feeNAME;
	}

	public void setFeeNAME(String feeNAME) {
		this.feeNAME = feeNAME;
	}

	public int getFeePRICE() {
		return feePRICE;
	}

	public void setFeePRICE(int feePRICE) {
		this.feePRICE = feePRICE;
	}

	public String getFeeCOMMENT() {
		return feeCOMMENT;
	}

	public void setFeeCOMMENT(String feeCOMMENT) {
		this.feeCOMMENT = feeCOMMENT;
	}

}