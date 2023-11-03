package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.LoanApplyDetails;

public interface ILoanService {

	void createLoan(LoanApplyDetails loan);
	void updateLoan(LoanApplyDetails loan);
	
	void deleteLoan(int loanNo);
	
	LoanApplyDetails loanDetails(int loanNo);
	List<LoanApplyDetails> getAllLoanDetails(int loanNo);
	
	
}
