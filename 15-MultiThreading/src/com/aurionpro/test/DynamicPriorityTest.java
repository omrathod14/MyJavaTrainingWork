package com.aurionpro.test;

import com.aurionpro.model.DynamicPriorityEx;

public class DynamicPriorityTest {
	public static void main(String[] args) {
		
		new DynamicPriorityEx("thread 1", 4).start();
		new DynamicPriorityEx("thread 2", 8).start();
		
		new DynamicPriorityEx("thread 3", 2).start();
		new DynamicPriorityEx("thread 4", 9).start();
	}

}
