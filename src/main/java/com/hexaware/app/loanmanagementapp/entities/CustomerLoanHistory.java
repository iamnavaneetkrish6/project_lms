package com.hexaware.app.loanmanagementapp.entities;

public class CustomerLoanHistory {

	private int loanNo;
	private long loanAmount;
	private String loanPaymentStatus;
	private int customerId;
	
	
	public CustomerLoanHistory() {
		// TODO Auto-generated constructor stub
	}


	public CustomerLoanHistory(int loanNo, long loanAmount, String loanPaymentStatus, int customerId) {
		super();
		this.loanNo = loanNo;
		this.loanAmount = loanAmount;
		this.loanPaymentStatus = loanPaymentStatus;
		this.customerId = customerId;
	}


	public int getLoanNo() {
		return loanNo;
	}


	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}


	public long getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getLoanPaymentStatus() {
		return loanPaymentStatus;
	}


	public void setLoanPaymentStatus(String loanPaymentStatus) {
		this.loanPaymentStatus = loanPaymentStatus;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	
}
