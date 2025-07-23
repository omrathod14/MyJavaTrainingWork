package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		Student student = new Student();
		Class c = Student.class;
		System.out.println(c.getName());

//		System.out.println("Methods are:");
//		for (Method methods : c.getDeclaredMethods()) {
//			System.out.println(methods.getName());
//			System.out.println("Type: " + methods.getReturnType());
//			System.out.println("Modifier: " + Modifier.toString(methods.getModifiers()));
//		}
//		
//		for( Constructor cons : c.getConstructors()) {
//			System.out.println("Constructor: "+ cons);
//		}
		
		Field fields = c.getDeclaredField("cgpa");
		
		fields.setAccessible(true);
		System.out.println("cgpa is: "+fields.get(student));
		
		Method method = c.getDeclaredMethod("greet");
		method.setAccessible(true);
		method.invoke(student);
		
	}

}
