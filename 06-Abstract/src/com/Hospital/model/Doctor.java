package com.Hospital.model;

import java.util.Arrays;

public class Doctor extends HospitalStaff {
	 String specialization;
	 String[] patients;

	public Doctor(int staffId, String name, String department, String specialization, String[] patients) {
		super(staffId, name, department);
		this.specialization = specialization;
		this.patients = patients;
	}

	@Override
	public void work() {
		System.out.println(name + " (Doctor) is treating patients in " + specialization + ".");
	}

	@Override
	public String toString() {
		return super.toString() + ", Specialization: " + specialization + ", Patients: " + Arrays.toString(patients);
	}
}
