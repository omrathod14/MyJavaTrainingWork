package com.aruionpro.test;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File file= new File("Demo.docx");
		
		if(file.createNewFile()) {
			System.out.println("File Created Successfully");
		}
	else

	{
		System.out.println("File Already Exists");
	}

}
}
