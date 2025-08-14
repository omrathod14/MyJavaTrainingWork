package com.aurionpro.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.HiddenOps;

public class HiddenOpsTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Class<HiddenOps> c = HiddenOps.class;

		Object obj = c.getDeclaredConstructor().newInstance();

		Method method = c.getDeclaredMethod("secretCode", String.class);
		method.setAccessible(true);

		Object result = method.invoke(obj, "Hello");

		System.out.println("Reversed String is:" + result);

	}

}
