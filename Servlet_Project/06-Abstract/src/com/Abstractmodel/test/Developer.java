package com.Abstractmodel.test;

import com.Abstractmodel.model.Employee;

public class Developer extends Employee {
	double baseSal;
	double bonus;

	public Developer(String name, int id, double baseSal, double bonus) {
		super(name, id);
		this.baseSal = baseSal;
		this.bonus = bonus;

	}

	public double CalculateSalary() {
		return baseSal + bonus;
	}

}
