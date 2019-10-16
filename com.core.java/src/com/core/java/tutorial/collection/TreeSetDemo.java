package com.core.java.tutorial.collection;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		/*
		 * All constructors of TreeSet 
		 * TreeSet t1=new TreeSet();
		 * TreeSet t2=new TreeSet(Comparator c); 
		 * TreeSet t3=new TreeSet(Collection c); 
		 * TreeSet t4=new TreeSet(SortedSet s);
		 */
		
		TreeSet<String> treeSet=new TreeSet<String>();
		System.out.println("Empty ? "+treeSet.isEmpty());
		//treeSet.add(null); // NPE  : null insertion as first element is not allowed after 1.7 v 
		treeSet.add("A");
		treeSet.add("X");
		treeSet.add("M");
		treeSet.add("F");
		treeSet.add("G");
		
		//treeSet.add(10); //ClassCastException  , compareTo();
		
		System.out.println(treeSet);
		
		System.out.println("if we want in descending order");
		Comparator<String> c= (s1,s2)->-s1.compareTo(s2);
		TreeSet treeSetDesc=new TreeSet(c);
		treeSetDesc.add("A");
		treeSetDesc.add("X");
		treeSetDesc.add("M");
		treeSetDesc.add("F");
		treeSetDesc.add("G");
		
		System.out.println(treeSetDesc);
		
		
		//the object or element which are added to the TreeSet should be homogenous and comparable 
		//StringBuffer does not implements comparable interface
		//We can define custom sorting order for StringBuffer
		
		/*
		 * TreeSet treeSetHomoComparable=new TreeSet();
		 * 
		 * treeSetHomoComparable.add(new StringBuffer("A"));
		 * treeSetHomoComparable.add(new StringBuffer("B"));
		 * 
		 * System.out.println(treeSetHomoComparable);
		 */
		
		
	}

}
