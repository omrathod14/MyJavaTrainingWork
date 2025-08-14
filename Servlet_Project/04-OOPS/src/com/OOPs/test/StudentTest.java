package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int no_of_students = sc.nextInt();

		sc.nextLine();

		Student students[] = new Student[no_of_students];

		for (int i = 0; i < no_of_students; i++) {

			System.out.println("Enter Name:");
			String name = sc.nextLine();

			System.out.println("Enter Roll No:");
			int rollno = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter Marks:");
			int marks = sc.nextInt();
			sc.nextLine();

			students[i] = new Student();
			students[i].setName(name);
			students[i].setRollno(rollno);

			while (!students[i].setMarks(marks)) {
				System.out.println("Enter Marks Again:");
				marks = sc.nextInt();
			}
			students[i].setMarks(marks);

		}

		for (Student student : students) {
			System.out.println("\n-----------------------------------------");
			System.out.println("Name of student:" + student.getName());
			System.out.println("Roll no student:" + student.getRollno());
			System.out.println("Marks of student:" + student.getMarks());
			System.out.println("\n------------------------------------------");
		}
	}

}
