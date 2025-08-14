package com.staticpractice.test;

public class BankAccMain {
	    public static void main(String[] args) {
	        
	        BankAcc a1 = new BankAcc(101);
	        BankAcc a2 = new BankAcc(102);

	        // Display initial details
	        System.out.println("Before changing bank name:");
	        a1.showDetails();
	        a2.showDetails();

	        // Change bankName using class name
	        BankAcc.bankName = "SBI Bank";

	        // Display updated details
	        System.out.println("\nAfter changing bank name:");
	        a1.showDetails();
	        a2.showDetails();
	    }
	}



