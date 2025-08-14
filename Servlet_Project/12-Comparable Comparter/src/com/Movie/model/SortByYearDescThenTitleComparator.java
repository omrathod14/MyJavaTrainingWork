package com.Movie.model;

import java.util.Comparator;

public class SortByYearDescThenTitleComparator implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		if (m1.year != m2.year) {
			return m2.year - m1.year;
		} else {
			return m1.title.compareToIgnoreCase(m2.title); // A to Z
		}
	}
}
