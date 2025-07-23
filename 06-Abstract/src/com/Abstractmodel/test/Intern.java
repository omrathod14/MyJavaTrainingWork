package com.Abstractmodel.test;

import com.Abstractmodel.model.Employee;

public class Intern extends Employee {
	double Stipend;

	Intern(String name, int id, double stipend) {
		super(name, id);
		this.Stipend = stipend;
	}

	@Override
	public double CalculateSalary() {
		return Stipend;
	}
}
