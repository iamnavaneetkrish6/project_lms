package com.hexaware.app.loanmanagementapp.entities;

public class LoanStatus {

	private int loanNo;
	private String loanStatus;
	
	public LoanStatus() {
		// TODO Auto-generated constructor stub
	}

	public LoanStatus(int loanNo, String loanStatus) {
		super();
		this.loanNo = loanNo;
		this.loanStatus = loanStatus;
	}

	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	
	
	
}
