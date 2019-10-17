package com.core.java.tutorial.collection;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al=new ArrayList<String>();
		al.add("h");
		al.add("gh");
		al.add("gh");
		al.add("gh");
		al.add("gh");
		al.add("gh");
		al.add("gh");
		al.add("gh");
		
		/*
		 * Predicate<String> p=s->s.length()==1;
		 * 
		 * System.out.println("Size of ArrayList: "+al.removeIf(p));
		 * 
		 * Iterator itr=al.iterator(); System.out.println("Sixe: "+al.set(3,
		 * "modified")); while(itr.hasNext()) {
		 * 
		 * System.out.println(itr.next()); //itr.remove(); }
		 * System.out.println("Size "+al.size());
		 */
		
		
		// Second demo
		ArrayList l=new ArrayList(al);
		l.add("abc");
		l.retainAll(al);
		System.out.println(l);
		
		
	}

}
