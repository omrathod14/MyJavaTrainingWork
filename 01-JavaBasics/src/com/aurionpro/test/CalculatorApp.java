package com.aurionpro.test;

import java.util.Scanner;

public class CalculatorApp {
	public static int add(int number1, int number2) {
		return number1 + number2;                         //method creation

	}

	public static int sub(int number1, int number2) {
		if(number1>number2) {
			return number1 - number2;
		}else {
			return number2 - number1;
		}

	}

	public static int multi(int number1, int number2) {
		return number1 * number2;

	}

	public static int div(int number1, int number2) {
		return number1 / number2;

	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number 1:");
	int number1=sc.nextInt();
	System.out.println("Enter the Number 2:");
	int number2=sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Enter the Choice you want(Addition:1,subtraction:2,multiplication:3,division:4):");
	int choice=sc.nextInt();
	int result=0;
	switch(choice){
	
	case 1:
		result=add(number1,number2);       //method call
		System.out.println("Addition is:"+result);
		break;
	
	case 2:
		result=sub(number1,number2);
		System.out.println("Subtraction is:"+result);
		break;
	case 3:
		result=multi(number1,number2);
		System.out.println("Multiplication is:"+result);
		break;
	case 4:
		result=div(number1,number2);
		System.out.println("Division is:"+result);
		break;
	default:
		System.out.println("Enter Valid Choice!!");
	
		
	}
	
}

}
