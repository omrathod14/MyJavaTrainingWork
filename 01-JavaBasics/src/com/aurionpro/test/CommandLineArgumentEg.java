package com.aurionpro.test;

public class CommandLineArgumentEg {
	public static void main(String arg[]) {
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		int c=a+b;
		System.out.println("Sum of Two Numbers is:"+c);
		System.out.print("hello my name is:"+arg[2]+" " +arg[3]);
		
	}

}
