package com.aurionpro.model;

public class LoanAccount implements AccountOperations {
	private double loanBalance = 50000;

	public void deposit(double amount) {
		System.out.println("Deposit not allowed in Loan Account.");
	}

	public void withdraw(double amount) {
		loanBalance += amount;
		System.out.println("Loan of Rs" + amount + " taken. Total Loan: Rs" + loanBalance);
	}

	public void checkBalance() {
		System.out.println("Loan Account Balance (Amount Due): Rs" + loanBalance);
	}

	public String getAccountType() {
		return "Loan Account";
	}
}
