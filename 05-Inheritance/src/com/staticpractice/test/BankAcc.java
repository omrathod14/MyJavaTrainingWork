package com.staticpractice.test;

public class BankAcc {

	int accountNumber; // Instance variable
	static String bankName = "ICCI Bank"; // Static variable

	public BankAcc(int accNo) {
		this.accountNumber = accNo;
	}

	public void showDetails() {
		System.out.println("Account Number: " + accountNumber + ", Bank Name: " + bankName);
	}
}
