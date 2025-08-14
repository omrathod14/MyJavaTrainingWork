
package com.Abstractmodel.model;

public  class ScienceStudent extends Student {
	int physics, chemistry, maths;

	public ScienceStudent(int rollNumber, String name, int physics, int chemistry, int maths) {
		super(rollNumber, name);
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	public double calculateAvg() {
		return (physics + chemistry + maths) / 3.0;
	}

	public String calculateGrade() {
		double avg = calculateAvg();
		if (avg >= 75)
			return "A";
		else if (avg >= 60)
			return "B";
		else if (avg >= 45)
			return "C";
		else
			return "D";
	}
}
