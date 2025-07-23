package com.Flight.model;

import java.util.Comparator;

public class SortByFareDescendingComparator implements Comparator<Flight> {
	public int compare(Flight f1, Flight f2) {
		return Double.compare(f2.fare, f1.fare);
	}
}
