package com.OOPs.model;

public class BankAccount {
	    private String accountNumber;
	    private String holderName;
	    private double balance;

	   
	    public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	  
	    public double getBalance() {
	        return balance;
	    }

	
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited Rs" + amount + " successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	 
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew Rs" + amount + " successfully.");
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    
	    public void checkBalance() {
	        System.out.println("Account Holder: " + holderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: ₹" + balance);
	        System.out.println("--------------------------");
	    }
	}



