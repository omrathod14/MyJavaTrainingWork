package com.MethodOverloading;

public class StudentAttendance {
	

	    public void markAttendance() {
	        System.out.println("General attendance marked for the day.");
	    }

	   
	    public void markAttendance(String name) {
	        System.out.println("Attendance marked for: " + name);
	    }

	 
	    public void markAttendance(String[] names) {
	        System.out.println("Marking attendance for multiple students:");
	        for (String name : names) {
	            System.out.println("Attendance marked for: " + name);
	        }
	    }

	   
	    public static void main(String[] args) {
	        StudentAttendance attendance = new StudentAttendance();

	        // General attendance
	        attendance.markAttendance();

	        // Single student
	        attendance.markAttendance("Amit");

	        // Multiple students
	        String[] students = {"Riya", "Raj", "Simran"};
	        attendance.markAttendance(students);
	    }
	}



