package com.Abstractmodel.test;

import com.Abstractmodel.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee[] = new Employee[4];

		employee[0] = new Developer("Om", 34, 50000, 10000);
		employee[1] = new Developer("Srushti", 54, 60000, 20000);

		employee[2] = new Intern("Aardhya", 44, 20000);
		employee[3] = new Intern("Rushabh", 64, 30000);

		for (Employee emp : employee) {
			System.out.println("Name of Employee: " + emp.getname() + " Salary: " + emp.CalculateSalary());
		}

	}

}
