package com.aruionpro.test;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("Demo.txt", true);
		writer.append("Hello my name is Om.\n How are you");
		writer.close();
		
		System.out.println("Operation of writing done!!");
	}

}
