package com.aurionpro.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.MathUtil;

public class MathUtilTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class<MathUtil> c=MathUtil.class;
		
		Object obj =c.getDeclaredConstructor().newInstance();
		
		Method method =c.getDeclaredMethod("square", int.class);
		
		Object result=method.invoke(obj, 8);
		System.out.println("Square of Number:"+result);
	}

	
}
