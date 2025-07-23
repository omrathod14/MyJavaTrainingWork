package com.Payroll.Project;
import java.util.Scanner;

public class PayrollMain {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Payroll payroll = new Payroll();

	        for (int i = 0; i < 5; i++) {
	            System.out.print("\nEnter Employee ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Salary: ");
	            double salary = sc.nextDouble();
	            sc.nextLine();

	            System.out.print("Enter Role (MANAGER, DEVELOPER, DESIGNER, TESTER, HR): ");
	            String roleInput = sc.nextLine().toUpperCase();
	            JobRole role = JobRole.valueOf(roleInput);

	            Employee emp = new Employee(id, name, salary, role);
	            payroll.addEmployee(emp);
	        }

	        payroll.displayAllEmployees();

	        System.out.print("\nEnter a role to search: ");
	        String searchRole = sc.nextLine().toUpperCase();
	        JobRole searchJob = JobRole.valueOf(searchRole);

	        payroll.searchByRole(searchJob);
	        sc.close();
	    }
}
