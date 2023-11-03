package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.AdminDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.entities.LoanTypes;

public class AdminServiceImp implements IAdminService {

	@Override
	public void createAdmin(AdminDetails customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAdmin(AdminDetails customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAdmin(int customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdminDetails getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDetails> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createLoanType(LoanTypes loanTypes) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLoanType(LoanTypes loanTypes) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLoanType(int customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public LoanTypes getLoanType(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanTypes> getAllLoanType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createLoanStatus(LoanStatus loanStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLoanStatus(LoanStatus loanStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLoanStatus(int loanNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public LoanStatus getLoanStatus(int loanNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanStatus> getAllLoanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
