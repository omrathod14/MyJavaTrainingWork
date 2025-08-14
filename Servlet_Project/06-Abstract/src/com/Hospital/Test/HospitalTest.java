package com.Hospital.Test;

import com.Hospital.model.Doctor;
import com.Hospital.model.HospitalStaff;
import com.Hospital.model.Nurse;

public class HospitalTest {
	public static void main(String[] args) {
		HospitalStaff[] staff = new HospitalStaff[3];

		staff[0] = new Doctor(101, "Dr. Sharma", "Cardiology", "Cardiologist", new String[] { "Ram", "Sita" });
		staff[1] = new Nurse(201, "Nurse Priya", "Pediatrics", "Morning");
		staff[2] = new Doctor(102, "Dr. Mehta", "Neurology", "Neurologist", new String[] { "Ravi", "Geeta", "Laxman" });

		for (HospitalStaff member : staff) {
			System.out.println(member.toString());
			member.work(); 
			System.out.println("---------------------------");
		}
	}
}
