package com.hexaware.app.loanmanagementapp.entities;

public class CustomerDetails {

	private int customerId;
	private String customerName;
	private String customerUsername;
	private String customerPassword;
	private String customerAddress;
	private String customerState;
	private String customerCountry;
	private String customerEmailId;
	
	
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}


	public CustomerDetails(int customerId, String customerName, String customerUsername, String customerPassword,
			String customerAddress, String customerState, String customerCountry, String customerEmailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.customerState = customerState;
		this.customerCountry = customerCountry;
		this.customerEmailId = customerEmailId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerUsername() {
		return customerUsername;
	}


	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerState() {
		return customerState;
	}


	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}


	public String getCustomerCountry() {
		return customerCountry;
	}


	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}


	public String getCustomerEmailId() {
		return customerEmailId;
	}


	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	
	

}
