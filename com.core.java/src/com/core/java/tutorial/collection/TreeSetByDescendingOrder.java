package com.core.java.tutorial.collection;
import java.util.TreeSet;

public class TreeSetByDescendingOrder {

	public static void main(String[] args) {

		TreeSet<String> tsAsc= new TreeSet<String>();
		tsAsc.add("Z");
		tsAsc.add("B");
		tsAsc.add("F");	
		tsAsc.add("A");
		tsAsc.add("k");
		
		System.out.println(tsAsc);
		
		TreeSet<String> tsDesc= new TreeSet<String>(new MyStringComparator());
		tsDesc.add("Z");
		tsDesc.add("B");
		tsDesc.add("F");	
		tsDesc.add("A");
		tsDesc.add("k");
		
		System.out.println(tsDesc);
		
		TreeSet<Integer> tsDes=new TreeSet<Integer>(new MyIntegerComparator());
		tsDes.add(56);
		tsDes.add(44);
		tsDes.add(10);
		tsDes.add(95);
		tsDes.add(4);
		
		System.out.println(tsDes);
		
		
		TreeSet<StringBuffer> tssbDesc=new TreeSet<StringBuffer>(new MyStringBufferComparator());
		tssbDesc.add(new StringBuffer("X"));
		tssbDesc.add(new StringBuffer("E"));
		tssbDesc.add(new StringBuffer("A"));
		tssbDesc.add(new StringBuffer("L"));
		tssbDesc.add(new StringBuffer("J"));
		tssbDesc.add(new StringBuffer("F"));
		
		System.out.println(tssbDesc);
		

	}

}
