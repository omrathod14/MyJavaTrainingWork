package com.aurionpro.patientdata.solution.model;

public class EmailNotifier {
	public void sendEmail(String recipientEmail, String subject, String message) {

		System.out.println("Sending Email To: " + recipientEmail);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
	}
}
