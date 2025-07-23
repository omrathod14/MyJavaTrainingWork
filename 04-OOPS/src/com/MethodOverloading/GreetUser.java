package com.MethodOverloading;

import java.util.Scanner;

public class GreetUser {
	
	public void greet() {
		System.out.println("Hello");
	}
	
	public void greet(String name) {
		System.out.println("Hello "+ name+"!");
	}
	
	public static void main(String[] args) {
		GreetUser greet=new GreetUser();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		greet.greet(name);
		greet.greet();
		
	}

}
