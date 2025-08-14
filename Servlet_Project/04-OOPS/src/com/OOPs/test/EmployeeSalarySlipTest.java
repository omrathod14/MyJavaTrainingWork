package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.EmployeeSalarySlip;

public class EmployeeSalarySlipTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of name of employee:");
		String name=sc.nextLine();
		
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the salary of employee:");
		double salary=sc.nextDouble();
		
		EmployeeSalarySlip emp=new EmployeeSalarySlip(name,id,salary);
		
		System.out.println("The Total Salary of employee is:");
		System.out.println(emp.GenerateSalSlip());
		
	}

}
