package com.hexaware.app.loanmanagementapp.entities;

import java.util.Date;

public class LoanApplyDetails {

	private int loanNo;
	private int loanTypeId;
	private double loanAmount;
	private Date loanApplyDetails;
	private String propertyAddress;
	private int CustomerId;
	
	
	public LoanApplyDetails() {
		// TODO Auto-generated constructor stub
	}


	public LoanApplyDetails(int loanNo, int loanTypeId, double loanAmount, Date loanApplyDetails,
			String propertyAddress, int customerId) {
		super();
		this.loanNo = loanNo;
		this.loanTypeId = loanTypeId;
		this.loanAmount = loanAmount;
		this.loanApplyDetails = loanApplyDetails;
		this.propertyAddress = propertyAddress;
		CustomerId = customerId;
	}


	public int getLoanNo() {
		return loanNo;
	}


	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}


	public int getLoanTypeId() {
		return loanTypeId;
	}


	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public Date getLoanApplyDetails() {
		return loanApplyDetails;
	}


	public void setLoanApplyDetails(Date loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}


	public String getPropertyAddress() {
		return propertyAddress;
	}


	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	
	
}
