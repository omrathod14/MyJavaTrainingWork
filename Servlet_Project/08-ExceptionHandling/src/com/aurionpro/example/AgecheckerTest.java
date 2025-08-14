package com.aurionpro.example;

import java.util.Scanner;

public class AgecheckerTest {
	public static void main(String[] args)  throws AgeException {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new AgeException("Sorry you can't vote!!");
		}
	}catch(AgeException e){
		e.printStackTrace();
	}
	}

}
