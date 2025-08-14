package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.BankAccounnt;

public class BankAccounntTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of accounts to be added:");
		int size=sc.nextInt();
		
		sc.nextLine();
		
		BankAccounnt BankAcc[]=new BankAccounnt[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter the Account Number:");
			int AccNum=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the AccountHolder Name:");
			String AccNam=sc.nextLine();
			
			System.out.println("Enter the Current Balance:");
			double AccBal=sc.nextDouble();
			
			BankAcc[i]=new BankAccounnt(AccNum,AccNam,AccBal);
		}
		
		System.out.println("Account Balances are:");
		for(BankAccounnt acc:BankAcc) {
			acc.checkbalance();
		}
	}

}
