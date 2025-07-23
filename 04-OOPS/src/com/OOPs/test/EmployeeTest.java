package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.Employee;

public class EmployeeTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Salary: Rs");
	        double salary = sc.nextDouble();

	       
	        Employee emp = new Employee(name, salary);

	      
	        System.out.print("Enter Bonus to assign: Rs");
	        double bonus = sc.nextDouble();
	        emp.setBonus(bonus);

	        
	        emp.displaySalary();
	        emp.displayFinalSalary();

	      
	    }
	}



