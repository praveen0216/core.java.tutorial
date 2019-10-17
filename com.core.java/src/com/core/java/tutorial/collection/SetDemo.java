package com.core.java.tutorial.collection;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class SetDemo {

	public static void main(String[] args) {
		//not generic 
		HashSet h=new HashSet();
		System.out.println(h.isEmpty()); //true
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(null);
		System.out.println(h);
		System.out.println(h.add(40));
		
		//generic
		HashSet<String> hs=new HashSet<String>();
		hs.add("Keep");
		hs.add("IT");
		hs.add("Plain");
		hs.add("Simple");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.add("Keep"));
		
		List l= new ArrayList();
		l.add(10);
		l.add(65);
		
		HashSet h1 = new HashSet(25);
		HashSet h2= new HashSet(19,0.5f);
		HashSet h3= new HashSet(l);
		System.out.println(h3);
		
		

	}

}
