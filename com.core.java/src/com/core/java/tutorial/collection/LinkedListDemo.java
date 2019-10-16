package com.core.java.tutorial.collection;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("helo");
		ll.add("end");
		ll.add(null);
		
		System.out.println("linked List \n"+ll);
		
		System.out.println("First element "+ll.peek());
		System.out.println("First element "+ll.getFirst());

		System.out.println("last element "+ll.getLast());
		
		System.out.println(ll.get(1));
		
		
		LinkedList lll=new LinkedList(ll);
		System.out.println(lll);
		
		
	}

}
