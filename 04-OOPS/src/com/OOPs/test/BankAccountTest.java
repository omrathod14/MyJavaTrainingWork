package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.BankAccount;

public class BankAccountTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Account Number: ");
	        String accNum = sc.nextLine();

	        System.out.print("Enter Account Holder Name: ");
	        String holder = sc.nextLine();

	        System.out.print("Enter Initial Balance:Rs");
	        double bal = sc.nextDouble();

	        BankAccount acc = new BankAccount(accNum, holder, bal);

	        
	        acc.checkBalance();

	    
	        System.out.print("Enter amount to deposit: Rs");
	        double depositAmount = sc.nextDouble();
	        acc.deposit(depositAmount);
	        acc.checkBalance();

	  
	        System.out.print("Enter amount to withdraw: Rs");
	        double withdrawAmount = sc.nextDouble();
	        acc.withdraw(withdrawAmount);
	        acc.checkBalance();

	       
	    }
	}



