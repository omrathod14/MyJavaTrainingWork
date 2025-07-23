package com.aurionpro.test;

import java.util.Scanner;

public class CurrencyApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Amount less than 50000 and multiple of 100 :");
		int amount=scanner.nextInt();
		
		if(amount>50000) {
			System.out.println("Amount Should not exceed 50000!!");
		}else if(amount%100!=0) {
			System.out.println("Sorry!!Amount should be multiple of 100!!");
		}else {
			int n2000=amount/2000;
			amount=amount%2000;
			
			int n500=amount/500;
			amount=amount%500;
			
			int n200=amount/200;
			amount=amount%200;
			
			int n100=amount/100;
			
			System.out.println("2000 notes:"+n2000);
			System.out.println("500 notes:"+n500);
			System.out.println("200 notes:"+n200);
			System.out.println("100 notes:"+n100);
			
		}
		}
	}

