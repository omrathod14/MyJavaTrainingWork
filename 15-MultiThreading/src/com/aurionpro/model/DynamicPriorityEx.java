package com.aurionpro.model;

public class DynamicPriorityEx extends Thread{
	
	public DynamicPriorityEx(String name,int priority) {
		setName(name);
		setPriority(priority);
	}
	
	public void run() {
		System.out.println(getName() + " Started with priority:"+getPriority());
	}
	
	

}
