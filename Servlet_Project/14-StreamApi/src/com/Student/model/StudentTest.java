package com.Student.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {

		List<Student> studentlist = Arrays.asList(new Student("Om", 34, 8.77), new Student("Aradhya", 23, 9.14),
				new Student("Srushti", 54, 9.14));

		studentlist.stream().sorted(Comparator.comparingDouble((Student s) -> s.cgpa).thenComparing(s->s.name)).forEach(System.out::println);

	}

}
