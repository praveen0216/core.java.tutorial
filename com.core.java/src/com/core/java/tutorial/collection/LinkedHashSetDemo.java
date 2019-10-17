package com.core.java.tutorial.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Keep");
		hs.add("IT");
		hs.add("Plain");
		hs.add("Simple");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.add("Keep"));
		
		LinkedHashSet lhs=new LinkedHashSet(hs);
		System.out.println(lhs);//same order as given by hs 

		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		
		System.out.println(lhs);
		
		System.out.println("Now adding E F G H in HashSet");
		
		HashSet<String> hss=new HashSet<String>(lhs);
		hss.add("E");
		hss.add("F");
		hss.add("G");
		hss.add("H");
		System.out.println(hss);
		
	}

}
