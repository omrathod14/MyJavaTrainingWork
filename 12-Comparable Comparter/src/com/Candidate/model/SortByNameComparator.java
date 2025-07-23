package com.Candidate.model;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Candidate> {

	@Override
	public int compare(Candidate a, Candidate b) {
		int nameCompare = a.name.compareToIgnoreCase(b.name);

		if (nameCompare == 0) {
			return a.age - b.age;
		} else {
			return nameCompare;
		}

	}

}
