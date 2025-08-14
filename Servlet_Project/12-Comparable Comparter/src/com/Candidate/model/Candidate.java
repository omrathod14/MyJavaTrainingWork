package com.Candidate.model;

public class Candidate {
	String name;
	int age;

	public Candidate(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}
