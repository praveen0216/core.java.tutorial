package com.core.java.tutorial.collection;
import java.util.Comparator;

public class MyStringBufferOperationComparator implements Comparator{

	@Override
	public int compare(Object b1,Object b2) {
		String s1=b1.toString();
		String s2=b2.toString();
		
		int len1=s1.length();
		int len2=s2.length();
		
		return (len1<len2)?1:(len1>len2)?-1:-s1.compareToIgnoreCase(s2);
	}
	
}
