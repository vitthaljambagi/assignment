package com.xworkz.app.dto.assign;

import java.io.Serializable;

public class AssignDTO implements Serializable{
	
	private String emailId;
	private int pin;
	
	public AssignDTO() {
		System.out.println("creat \t"+this.getClass().getSimpleName());
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "AssignDTO [emailId=" + emailId + ", pin=" + pin + "]";
	}
	
	

}
