package com.aurionpro.model;

public class CurrentAccount implements AccountOperations {
	double balance = 2000;

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs" + amount + " deposited to Current Account.");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Rs" + amount + " withdrawn from Current Account.");
		} else {
			System.out.println("Withdrawal failed: insufficient balance.");
		}
	}

	public void checkBalance() {
		System.out.println("Current Account Balance: Rs" + balance);
	}

	public String getAccountType() {
		return "Current Account";
	}
}
