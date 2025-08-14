package com.aurionpro.patientdata.solution.model;

public class PatientRecord {
	private String name;
	private int age;
	private String diagnosis;

	public PatientRecord(String name, int age, String diagnosis) {
		this.name = name;
		this.age = age;
		this.diagnosis = diagnosis;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDiagnosis() {
		return diagnosis;
	}
}
