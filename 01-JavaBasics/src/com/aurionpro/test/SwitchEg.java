package com.aurionpro.test;

import java.util.Scanner;

public class SwitchEg {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the month (1-12):");
		int month=scanner.nextInt();
		
		switch (month){
		case 1:
			System.out.print("This Month has 31 days");
		break;
		
		case 2:
			System.out.print("This Month has 28 days");
			break;
		case 3:
			System.out.print("This Month has 31 days");
			break;
		case 4:
			System.out.print("This Month has 30 days");
			break;
		case 5:
			System.out.print("This Month has 31 days");
			break;
		case 6:
			System.out.print("This Month has 30 days");
			break;
		case 7:
			System.out.print("This Month has 31 days");
			break;
		case 8:
			System.out.print("This Month has 31 days");
			break;
		case 9:
			System.out.print("This Month has 30 days");
			break;
		case 10 :
			System.out.print("This Month has 31 days");
			break;
		case 11 :
			System.out.print("This Month has 30 days");
			break;
		case 12 :
			System.out.print("This Month has 31 days");
			break;
		default :
			System.out.print("Enter valid Number!!");
			
		
			
		}
		
	}

}
