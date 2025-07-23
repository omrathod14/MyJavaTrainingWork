package com.aurionpro.test;

public class Stringtest {

	public static void main(String[] args) {
//		String str1="om";
//		String str2="om";
//		System.out.println(str1==str2); // strings does not have unique reference
		
//		String str1="Hello ";
//	    str1=str1.concat("world");
//		System.out.println(str1);
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2);   //objects have unique reference
		

	}

}
