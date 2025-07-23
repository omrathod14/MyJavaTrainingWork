package com.Hospital.model;

public class Nurse extends HospitalStaff {
	 String shiftTimings;

	public Nurse(int staffId, String name, String department, String shiftTimings) {
		super(staffId, name, department);
		this.shiftTimings = shiftTimings;
	}

	@Override
	public void work() {
		System.out.println(name + " (Nurse) is attending patients during " + shiftTimings + " shift.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Shift Timings: " + shiftTimings;
	}
}
