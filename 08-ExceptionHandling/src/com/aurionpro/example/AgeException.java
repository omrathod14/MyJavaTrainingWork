package com.aurionpro.example;

public class AgeException extends Exception {

	public AgeException() {
		System.out.println("Not Eligible to vote!!!!");
	}

	public AgeException(String message) {
		super(message);
	}

}
