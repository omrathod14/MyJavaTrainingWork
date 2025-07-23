
package com.aurionpro.Enum.Test;

public class GradeMethod {

    public String getGradeDescription(String input) {
        input = input.toUpperCase();

        if (input.equals("A") || input.equals("B") || input.equals("C") || input.equals("D") || input.equals("F")) {
            Grade grade = Grade.valueOf(input);  
            switch (grade) {
                case A:
                    return "Excellent";
                case B:
                    return "Good";
                case C:
                    return "Average";
                case D:
                    return "Below Average";
                case F:
                    return "Fail";
            }
        }
        return "Invalid grade entered.";
    }
}

