package com.OOPs.model;

public class Employee {
	    private String name;
	    private double salary;
	    private double bonus;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	        this.bonus = 0; 
	    }

	    public void setBonus(double bonus) {
	        if (bonus <= 0.2 * salary) {
	            this.bonus = bonus;
	            System.out.println("Bonus set to Rs" + bonus);
	        } else {
	            System.out.println("Invalid bonus! Bonus should not exceed 20% of salary.");
	        }
	    }

	    public void displaySalary() {
	        System.out.println("Salary of " + name + ": Rs " + salary);
	    }

	    public void displayFinalSalary() {
	    	System.out.println("---------------------------------------------------");
	        System.out.println("Final Salary of " + name + " Rs " + (salary + bonus));
	        System.out.println("---------------------------------------------------");
	    }
	}


