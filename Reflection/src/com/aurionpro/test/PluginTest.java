package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.Plugin;

public class PluginTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<Plugin> c=Plugin.class;
		System.out.println("Class Name:"+c.getName());
		
		//private constructor accessible
		
		 Constructor<Plugin> constructor = c.getDeclaredConstructor();
	        constructor.setAccessible(true); 
	        
	        
	        Object plugin = constructor.newInstance();
	        
	      //  private field version and make it accessible
	        
	        Field field = c.getDeclaredField("version");
	        field.setAccessible(true);
	        field.set(plugin, 3.1);
	        
	        System.out.println("Version is: " + field.get(plugin));

	        // Step 6: Get and invoke the execute method
	        
	        Method method = c.getDeclaredMethod("execute");
	        method.setAccessible(true);
	        method.invoke(plugin);
	}

}
