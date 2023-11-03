package com.hexaware.app.loanmanagementapp.entities;

public class AdminDetails {

	private int adminId;
	private String adminName;
	private String emailId;
	private String adminUsername;
	private String password;
	
	
	public AdminDetails() {
		// TODO Auto-generated constructor stub
	}


	public AdminDetails(int adminId, String adminName, String emailId, String adminUsername, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.emailId = emailId;
		this.adminUsername = adminUsername;
		this.password = password;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getAdminUsername() {
		return adminUsername;
	}


	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
}
