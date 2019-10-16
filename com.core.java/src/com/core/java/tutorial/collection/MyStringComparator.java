package com.core.java.tutorial.collection;
import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String str1,String str2) {
		
		return -str1.compareToIgnoreCase(str2); // using compareTo of comparable interface
		
		
	}
	
}
