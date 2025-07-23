package com.aurionpro.model;

public class ScienceStudent extends Student {
	int physics, chemistry, maths;

	public ScienceStudent(String name, int rollno, int physics, int chemistry, int maths) {
		super(name, rollno, "Science");
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;

	}

	@Override
	public float calculatePerformance() {
		return (physics + chemistry + maths) / 3;
	}

	@Override
	public String getGrade() {
		double avg = calculatePerformance();
		if (avg >= 75)
			return "A";
		else if (avg >= 60)
			return "B";
		else if (avg >= 45)
			return "C";
		else
			return "D";
	}

	@Override
	public void displaySubjects() {
		System.out.println("Subjects: " + "Physics=" + physics + " Chemistry= " + chemistry + " Maths=" + maths);
	}
}
