package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.AdminDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.entities.LoanTypes;

public interface IAdminService {

	void createAdmin(AdminDetails customer);
	void updateAdmin(AdminDetails customer);
	
	void deleteAdmin(int customerId);
	
	AdminDetails getAdminById (int adminId);
	List<AdminDetails> getAllAdmin();
	
	
	void createLoanType(LoanTypes loanTypes);
	void updateLoanType(LoanTypes loanTypes);
	
	void deleteLoanType(int customerId);
	
	LoanTypes getLoanType (int adminId);
	List<LoanTypes> getAllLoanType();
	
	
	
	void createLoanStatus(LoanStatus loanStatus);
	void updateLoanStatus(LoanStatus loanStatus);
	
	void deleteLoanStatus(int loanNo);
	
	LoanStatus getLoanStatus (int loanNo);
	List<LoanStatus> getAllLoanStatus();
	
	
}
