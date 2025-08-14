package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Employee details to be added:");
		int no_of_employee = sc.nextInt();

		sc.nextLine();

		Employee emp[] = new Employee[no_of_employee];

		for (int i = 0; i < no_of_employee; i++) {

			System.out.println("Enter the details of " + (i + 1)  + " Employee:");

			System.out.println("Enter the Employee ID:");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter the Employee Name:");
			String name = sc.nextLine();

			System.out.println("Enter the Employee Department:");
			String department = sc.nextLine();

			System.out.println("Enter the Employee Salary:");
			Double salary = sc.nextDouble();

			emp[i] = new Employee(id, name, department, salary);

		}
		System.out.println("Employee with lowest salary are: " + Employee.lowSalary(emp));
		   
	    sc.nextLine();
	    System.out.println("Enter department to search employees: ");
	    String findDept = sc.nextLine();
	    Employee.dept(emp, findDept);
	   
	    System.out.println("Total salary expense of company: " + Employee.salExpense(emp));
		
}
}