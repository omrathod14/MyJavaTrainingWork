package com.Abstractmodel.test;

import com.Abstractmodel.model.CommerceStudent;
import com.Abstractmodel.model.ScienceStudent;
import com.Abstractmodel.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[4];

		students[0] = new ScienceStudent(101, "Aryan", 80, 85, 78);
		students[1] = new ScienceStudent(102, "Neha", 60, 55, 58);
		students[2] = new CommerceStudent(201, "Kabir", 72, 70, 68);
		students[3] = new CommerceStudent(202, "Riya", 40, 42, 39);

		for (Student stu : students) {
			System.out.println(stu.getName() + " (Roll No: " + stu.getRollNumber() + ")");
			System.out.println("Average Marks: " + stu.calculateAvg());
			System.out.println("Grade: " + stu.calculateGrade());
			System.out.println("------------------------");
		}
	}
}
