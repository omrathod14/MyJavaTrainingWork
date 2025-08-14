package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) throws Exception {
		Student student = new Student("Om", 34);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.ser"));
		out.writeObject(student);
		out.close();
		System.out.println("Object Saved Successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.ser"));
		Student student2=(Student)in.readObject();
		in.close();
		System.out.println("Object Restored");
		
		student2.display();

	}

}
