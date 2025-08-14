package com.Banking.model;

public class SavingsAccount implements AccountOperations {
	double balance = 1000;
	final double withdrawLimit = 10000;

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs" + amount + " deposited to Savings Account.");
	}

	public void withdraw(double amount) {
		if (amount % 100 != 0) {
			System.out.println("Withdrawal failed: Amount must be a multiple of 100.");
		} else if (amount <= withdrawLimit && amount <= balance) {
			balance -= amount;
			System.out.println("Rs" + amount + " withdrawn from Savings Account.");
		} else {
			System.out.println("Withdrawal failed: exceeds limit or insufficient balance.");
		}
	}

	public void checkBalance() {
		System.out.println("Savings Account Balance: Rs" + balance);
	}

	public String getAccountType() {
		return "Savings Account";
	}
}
