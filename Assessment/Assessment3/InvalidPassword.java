package com.assessment.third;

public class InvalidPassword extends Exception{
	String password;

	public InvalidPassword(String password) {
		super();
		this.password = password;
	}
	public String show() {
		return "Invalid password"+password;
	}

}
