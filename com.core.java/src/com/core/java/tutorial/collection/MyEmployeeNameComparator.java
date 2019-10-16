package com.core.java.tutorial.collection;

import java.util.Comparator;

public class MyEmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		String name1= o1.getName();
		String name2=o2.getName();
		
		
		return name1.compareToIgnoreCase(name2);
	}

}
