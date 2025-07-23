package com.staticpractice.test;

public class StaticNonStaticMain {
	
	    public static void main(String[] args) {

	        // Call static method using class name
	        StaticNonStatic.showStatic();  

	        // Call non-static method using object
	        StaticNonStatic obj = new StaticNonStatic();
	        obj.showNonStatic();   
	    }
	}



