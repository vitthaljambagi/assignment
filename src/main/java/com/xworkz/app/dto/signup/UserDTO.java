package com.xworkz.app.dto.signup;

import java.io.Serializable;

import javax.persistence.Id;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String firstName;
	private String lastName;
	@Id
	private String emailId;
	private String countryName;
	private String countryCode;
	private String phoneNo;
	

	private Short status;

	public UserDTO() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", countryName="
				+ countryName + ", countryCode=" + countryCode + ", phoneNo=" + phoneNo + ", status=" + status + "]";
	}

	
	
	}

	

