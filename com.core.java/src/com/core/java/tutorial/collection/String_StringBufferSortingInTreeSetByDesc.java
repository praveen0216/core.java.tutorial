package com.core.java.tutorial.collection;
import java.util.TreeSet;

public class String_StringBufferSortingInTreeSetByDesc {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyStringBufferOperationComparator());
		ts.add("H");
		ts.add("S");
		ts.add(new StringBuffer("PPM"));
		ts.add("SSA");
		ts.add(new StringBuffer("M"));
		ts.add("AMMMMMMMMM");
		
		System.out.println(ts);
		
		
		
		
		

	}

}
