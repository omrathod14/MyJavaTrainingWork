
package com.aurionpro.Enum.Test;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeMethod method = new GradeMethod();

        System.out.print("Enter grade (A, B, C, D, F): ");
        String input = sc.next();

        String result = method.getGradeDescription(input);
        System.out.println(result);

        sc.close();
    }
}

