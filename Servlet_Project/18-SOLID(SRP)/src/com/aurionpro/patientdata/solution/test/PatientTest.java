package com.aurionpro.patientdata.solution.test;

import com.aurionpro.patientdata.solution.model.EmailNotifier;
import com.aurionpro.patientdata.solution.model.PatientRecord;
import com.aurionpro.patientdata.solution.model.RecordFormatter;

public class PatientTest {
	public static void main(String[] args) {
		PatientRecord patient = new PatientRecord("John Doe", 45, "Hypertension");

		RecordFormatter formatter = new RecordFormatter();
		String formatted = formatter.format(patient);
		System.out.println(formatted);

		EmailNotifier notifier = new EmailNotifier();
		notifier.sendEmail("doctor@example.com", "New Patient Record", formatted);
	}
}
