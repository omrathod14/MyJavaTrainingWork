package com.Employee.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Om", 75000, "2019-03-10", "Female"),
				new Employee("Srushti", 90000, "2017-06-12", "Male"),
				new Employee("Aradhya", 88000, "2018-08-20", "Male"),
				new Employee("Rushabh", 70000, "2020-01-01", "Female"),
				new Employee("Laxman", 60000, "2016-02-14", "Male"));

		//  Max Salary
		Employee maxSal = employees.stream().max(Comparator.comparingDouble(e -> e.salary)).orElse(null);
		System.out.println("1.Max Salary: " + maxSal);

		//  Second Highest Salary
		Employee secondHighSal = employees.stream()
				.sorted(Comparator.comparing(e -> Double.valueOf(e.salary), Comparator.reverseOrder())).skip(1)
				.findFirst().orElse(null);
		System.out.println("2.Second Highest Salary: " + secondHighSal);
		
		
		//3. Most Senior Employee (earliest joining date)
        Employee senior = employees.stream().min(Comparator.comparing(e -> e.joiningDate))  .orElse(null);
            System.out.println("3.Most Senior Employee: " + senior);

         // 4. Count by Gender
            
		Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()));

			System.out.println("4. Gender Count in Company are:");
			genderCount.forEach((gender, count) -> System.out.println(gender + ": " + count));
		}
       
        }
		
		
