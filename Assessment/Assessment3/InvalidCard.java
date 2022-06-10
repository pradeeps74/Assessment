package com.assessment.third;

public class InvalidCard extends Exception {
	String cardNum;

	public InvalidCard(String cardNum) {
		
		this.cardNum = cardNum;
	}
	public String show() {
		return "Invalid card number"+cardNum;
	}

}
