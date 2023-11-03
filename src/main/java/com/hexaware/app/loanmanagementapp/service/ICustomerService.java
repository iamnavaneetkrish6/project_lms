package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.CustomerDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;

public interface ICustomerService {

	void customerRegisteration(CustomerDetails customer);
	void updateCustomer(CustomerDetails customer);
	
	void deleteCustomer(int customerId);
	
	CustomerDetails getCustomerById (int customerId);
	List<CustomerDetails> getAllCustomer();
	
	LoanStatus getLoanStatus (int loanNo);
	
}
