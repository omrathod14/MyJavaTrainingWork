package com.aurionpro.test;

import java.util.Scanner;

public class RideBillGenerator {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Height:");
		int height=scanner.nextInt();
		int bill=0;
		
		if(height<=120) {
			System.out.println("you cannot ride");
		}else {
			System.out.println("Yes you can ride");
			System.out.println("Enter your age:");
			int age=scanner.nextInt();
			
			
			if(age<12) {
				bill=bill+5;
			}
			else if(age>12 && age<=18) {
					bill=bill+7;
				}
			else if(age>18) {
				if(age>45) {
					bill=bill+0;
				}else {
					bill=bill+12;
				}
			}
			System.out.println("Enter your Choice (0 or 1):");
			int choice= scanner.nextInt();
			
			switch (choice) {
			case 1 :
				bill=bill+3;
				System.out.println("$3 will be added to your total bill");
				break;
				
			case 0 :
				bill=bill+0;
				System.out.println("No photos will be added to your bill");
				break;
				
			default :
				System.out.println("Enter valid number!!");
				break;
				
			}
			
			
			System.out.println("Your total bill is $ "+bill);
		}
		
	}
	

}
