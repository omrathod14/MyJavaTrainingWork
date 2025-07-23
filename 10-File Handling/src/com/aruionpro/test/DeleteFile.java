package com.aruionpro.test;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File file=new File("Demo.docx");
		
		if(file.delete()) {
			System.out.println("File Deleted!! "+file.getName());
			
		}
		else {
			System.out.println("File Already Deleted");
		}
	}

}
