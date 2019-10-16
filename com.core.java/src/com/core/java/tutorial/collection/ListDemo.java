package com.core.java.tutorial.collection;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(12);
		
		System.out.println(l);
		l.add(0,4); // Element is added in the specified position and rest of the element are shifted to the right
		
		try {
		l.add(4, 4);// Throw IndexOutOfBoundException
		
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("caught exception");
		}
		System.out.println(l);
		
		ArrayList al=new ArrayList();
		al.add("hello");
		l.addAll(0, al);
		al.add(null);
		System.out.println(l);
		
		
		al.addAll(0,l);
		System.out.println(al);
		

	}

}
