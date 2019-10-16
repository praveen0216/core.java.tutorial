package com.core.java.tutorial.collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalImplementationCursor {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		Enumeration enu=v.elements();
		Iterator itr=v.iterator();
		ListIterator ltr=v.listIterator();
		
		System.out.println(enu.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
		
		

	}

}
