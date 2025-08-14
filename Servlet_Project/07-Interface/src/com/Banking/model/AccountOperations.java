package com.Banking.model;

public interface AccountOperations {
	void deposit(double amount);

	void withdraw(double amount);

	void checkBalance();

	String getAccountType();
}
