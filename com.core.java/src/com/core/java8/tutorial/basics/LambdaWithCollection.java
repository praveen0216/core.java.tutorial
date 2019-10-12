package com.core.java8.tutorial.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class LambdaWithCollection {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(1);
		
		System.out.println(al);

		ArrayList<Integer> a=new ArrayList<Integer>();
		//Collections.sort(al); Natural Sorting order : Ascending order
		
		// Approach 1: Lambda expression 
		// Collections.sort(al, (I1,I2)->(I1<I2)?1:(I1>I2)?-1:0); //Descending order using lambda expression
		
		// Approach 2 : using anonymous class
		  
		  
		/*
		 * Collections.sort(al,new Comparator() {
		 * 
		 * 
		 * 
		 * @Override public int compare(Object o1, Object o2) { Integer i1=(Integer)o1;
		 * Integer i2=(Integer)o2; return (i1<i2)?1:(i1>i2)?-1:0; }
		 * 
		 * 
		 * });
		 */
		  
		  Collections.sort(al,new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return (i1<i2)?1:(i1>i2)?-1:0;
			}
			  
		  });  
			 
		
		
		/* Approach 3 : by implenting Comparator Interface
		 * 
		 */
		
		/*
		 * Collections.sort(al,new MyComparator()); 
		 */
		  
		  System.out.println(al);
	}

}
