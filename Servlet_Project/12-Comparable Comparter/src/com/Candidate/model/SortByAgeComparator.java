package com.Candidate.model;

import java.util.Comparator;

public class SortByAgeComparator implements Comparator<Candidate> {
	public int compare(Candidate a, Candidate b) {
		return a.age - b.age;
	}
}
