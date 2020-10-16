package com.example.demo.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long loanNo;
	private String borrower;
	@Column(name = "dob")
	private LocalDate dob;
	private String address;
	private Long cost;
	private String floodRisk;
	
	

	public Property() {
		super();
	}
	

	public Property(Long id, Long loanNo, String borrower, LocalDate dob, String address, Long cost, String floodRisk) {
		super();
		this.id = id;
		this.loanNo = loanNo;
		this.borrower = borrower;
		this.dob = dob;
		this.address = address;
		this.cost = cost;
		this.floodRisk = floodRisk;
	}

	public Long getCost() {
		return cost;
	}

	public Long getId() {
		return id;
	}

	

	public String getFloodRisk() {
		return floodRisk;
	}

	public void setFloodRisk(String floodRisk) {
		this.floodRisk = floodRisk;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Long loanNo) {
		this.loanNo = loanNo;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
