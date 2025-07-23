package com.aurionpro.example;

import java.util.Scanner;

public class FinallyAtmCashWithdrawal {
	public static void main(String[] args) {
		int amount=10000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of withdrawal: ");
		int withdrawal=sc.nextInt();
		
		try {
			if(withdrawal>=amount) {
				throw new ArithmeticException("Arithmetic Exception");
			}
			else {
				amount-=withdrawal;
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Transaction End");
		}
	}

}
