package com.staticpractice.test;

public class Config {
	static double version;
	
	static {
		version=1.0;
		System.out.println("Static Block Excecuted!! Version is:"+version);
	}

}
