package com.Transaction.model;

public class Transaction {
	int id;
	double amount;

	public Transaction(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public String toString() {
		return "Transaction ID: " + id + ", Amount: ₹" + amount;
	}
}
