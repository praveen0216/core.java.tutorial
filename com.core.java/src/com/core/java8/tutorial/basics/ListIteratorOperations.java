
package com.core.java8.tutorial.basics;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(15);
		ll.add(58);
		ll.add(85);
		ll.add(52);
		ll.add(23);
		ll.add(12);
		ll.add(56);
		ll.add(54);
		
		System.out.println(ll);
		
		ListIterator ltr=ll.listIterator();
		while(ltr.hasNext()) {
			
			int x=(Integer)ltr.next();
			
			if(x==52) {
				ltr.remove();
				
			}
			if(x==12) {
				ltr.add(88);
			}
			if(x==23) {
				ltr.set(32);
			}
		}
		System.out.println(ll);
		
	}

}
