package com.core.java.tutorial.collection;

import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericStackDemo {

	public static void main(String[] args) {

		/*
		 * Stack<Integer> s=new Stack<Integer>(); s.push(null); s.push(54); s.push(78);
		 * s.push(988); s.push(988); s.push(988); s.push(988); s.push(988);
		 * 
		 * s.push(988); s.push(988); s.push(988);
		 * 
		 * 
		 * System.out.println(s);
		 * 
		 * System.out.println(s.capacity()); // capacity= 2* initial capacity=2*10=20
		 */

		Stack<String> ss = new Stack<String>();
		ss.push("Hello");
		ss.add("Sir");
		ss.addElement("Same");

		System.out.println(
				"Iterate using Enumeration \n -----------------------------------------------------------------------------------------");

		Enumeration enu = ss.elements();

		while (enu.hasMoreElements()) {

			System.out.println(enu.nextElement());

		}

		System.out.println(
				"Iterate through Iterator \n -------------------------------------------------------------------------------------------------------");

		Iterator itr = ss.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(
				"iterate through ListIterator \n ---------------------------------------------------------------------------------------");

		ListIterator ltr = ss.listIterator();
		System.out.println("forward ->>>>>>>");
		while (ltr.hasNext()) {
			System.out.println(ltr.next());

		}

		System.out.println("last element "+ss.pop());

		int last = ss.indexOf(ss.lastElement());
		ListIterator btr=ss.listIterator(last+1);
		System.out.println("backward iteration by list iterator \n");
		while(btr.hasPrevious()) {
			System.out.println(btr.previous());
		}
		
		
		System.out.println(ss.search("same"));//-1
		System.out.println(ss.search("Hello")); //offset top to bottom 1,2,....
		ss.push("A");
		ss.push("B");
		ss.remove("A");
		System.out.println(ss);
		
	}

}
