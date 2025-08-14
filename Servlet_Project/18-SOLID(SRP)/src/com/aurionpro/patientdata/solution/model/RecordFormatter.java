package com.aurionpro.patientdata.solution.model;

public class RecordFormatter {
	public String format(PatientRecord record) {
		return String.format("Patient Record\nName: %s\nAge: %d\nDiagnosis: %s", record.getName(), record.getAge(),
				record.getDiagnosis());
	}
}
