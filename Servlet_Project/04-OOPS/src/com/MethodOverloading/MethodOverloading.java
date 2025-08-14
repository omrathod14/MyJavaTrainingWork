package com.MethodOverloading;

import java.util.Scanner;

public class MethodOverloading {

	public void print() {
		System.out.println("Default Message");
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void print(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		MethodOverloading method=new MethodOverloading ();
		
		method.print();
		method.print("Hello My name is Om");
		method.print(8);

		
		

	}

}
