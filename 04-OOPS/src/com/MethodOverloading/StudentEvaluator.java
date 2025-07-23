package com.MethodOverloading;

public class StudentEvaluator {

	    public void evaluate(int marks) {
	        if (marks >= 90) {
	            System.out.println("Excellent");
	        } else {
	            System.out.println("Keep trying!");
	        }
	    }

	    public String evaluate(int marks, int totalMarks) {
	        double percentage = ( marks/ totalMarks) * 100;

	        if (percentage >= 90) {
	            return "A";
	        } else if (percentage >= 75) {
	            return "B";
	        } else {
	            return "C";
	        }
	    }

	    public String evaluate(String grade) {
	        if (grade.equals("A")) {
	            return "Very Good";
	        } else if (grade.equals("B")) {
	            return "Good";
	        } else {
	            return "Needs Improvement";
	        }
	    }

	    public static void main(String[] args) {
	        StudentEvaluator evaluator = new StudentEvaluator();

	        evaluator.evaluate(91);  // Output: Excellent

	        
	        String grade = evaluator.evaluate(80, 100);
	        System.out.println("Grade: " + grade);  // Output: Grade: B

	        String feedback = evaluator.evaluate(grade);
	        System.out.println("Feedback: " + feedback);  // Output: Feedback: Good
	    }
	}


