package com.Payroll.Project;

public class Payroll {
	Employee[] employees;
	int count;

	public Payroll() {
		employees = new Employee[5];
		count = 0;
	}

	public void addEmployee(Employee emp) {
		if (count < employees.length) {
			employees[count] = emp;
			count++;
		} else {
			System.out.println("Cannot add more employees. Payroll is full.");
		}
	}

	public void displayAllEmployees() {
		System.out.println("\n--- All Employees ---");
		for (int i = 0; i < count; i++) {
			employees[i].displayDetails();
		}
	}

	public void searchByRole(JobRole role) {
		System.out.println("\n--- Employees with role: " + role + " ---");
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (employees[i].getRole() == role) {
				employees[i].displayDetails();
				found = true;
			}
		}
		if (!found) {
			System.out.println("No employees found with role " + role);
		}
	}

}
