package com.Movie.model;

import java.util.Comparator;

public class SortByTitleThenYearComparator implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		int titleCompare = m1.title.compareToIgnoreCase(m2.title);
		if (titleCompare == 0) {
			return m2.year - m1.year;
		} else {
			return titleCompare;
		}
	}
}
