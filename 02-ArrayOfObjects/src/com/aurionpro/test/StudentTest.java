package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;


public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of students:");
		int no_of_student=sc.nextInt();
		
		sc.nextLine();
		
		Student[] students=new Student[no_of_student];
		
		System.out.println("Enter the student details:");
		for(int i=0;i<no_of_student;i++) {
			
			System.out.println("Enter your name:");
			String name=sc.nextLine();
			
			System.out.println("Enter your roll no:");
			int roll_no=sc.nextInt();
			
			
			
			System.out.println("Enter your Cgpa:");
			double cgpa=sc.nextDouble();
			
			students[i]=new Student(name,roll_no,cgpa);
			
		}
		for (Student result:students) {
			result.display();
		}
		sc.close();
		

	}

}
