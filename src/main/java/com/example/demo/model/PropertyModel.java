package com.example.demo.model;



import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertyModel {
	@JsonProperty("Id")
	public Long id;
	@JsonProperty("Loan No")
	public Long loanNo;
	@JsonProperty("Borrower Name")
	public String borrower;

	public PropertyModel() {
		super();
	}

	public PropertyModel(Long id, Long loanNo, String borrower, LocalDate dob, String address, Long cost,
			String floodRisk) {
		super();
		this.id = id;
		this.loanNo = loanNo;
		this.borrower = borrower;
		this.dob = dob;
		this.address = address;
		this.cost = cost;
		this.floodRisk = floodRisk;
	}

	@JsonProperty("DOB")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="MM/dd/yyyy")
	public LocalDate dob;
	@JsonProperty("Prop Address")
	public String address;
	@JsonProperty("Cost")
	public Long cost;
	@JsonProperty("Flood Risk")
	public String floodRisk;

}
