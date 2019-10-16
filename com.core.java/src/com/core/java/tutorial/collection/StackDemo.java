package com.core.java.tutorial.collection;
import java.util.Stack;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;


public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(10);
		s.push("Hello");
		s.push(new Date());
		
		
		System.out.println(s);
		
		
		s.add("kk");
		System.out.println(s);
		
		System.out.println("----------------------Enumeration---------------------------------------------------------------------------");
		
		//Enumeration 
		Enumeration enumer=s.elements();
		while(enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}
		
		System.out.println("------------------------ITERATOR-------------------------------------------------------------------------------");
		//iterator
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------LIST ITERATOR------------------------------------------------------------------------------------");
		
		//ListIterator
		ListIterator ltr=s.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
		
		

	}

}
