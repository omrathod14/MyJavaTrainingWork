package com.aurionpro.model;

import java.util.Comparator;

public class IdSortComparatorDescending implements Comparator<Student> {
		

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o2.id-o1.id;
		}

}
