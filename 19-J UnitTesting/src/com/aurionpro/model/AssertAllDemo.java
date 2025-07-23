package com.aurionpro.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class AssertAllDemo {
	
	
	@Test
	public void userDetails() {
		String name="Om";
		int age=23;
		String city="Delhi";
		
		assertAll("User Details",()->assertEquals("Om",name),()->assertTrue(age>18),()->assertEquals("Delhi",city));
	}

}
