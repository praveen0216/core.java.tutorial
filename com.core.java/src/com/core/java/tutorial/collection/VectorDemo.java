package com.core.java.tutorial.collection;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v=new Vector();
		System.out.println("current capacity of this vector "+v.capacity());
		
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("E");
		v.addElement("F");
		v.addElement("G");
		v.addElement("H");
		v.addElement("I");
		v.addElement("J");
		System.out.println("capacity now "+v.capacity());//10

		v.add("Z");
		System.out.println("capacity "+v.capacity());//20       capacity=2* initial=2*10=20
		
		System.out.println("Element removed "+v.remove(7)); //H
		
		
		//v.clear(); // remove all the elements   []
		System.out.println(v);

		
		Object[] obj= {};
		
		obj=v.toArray();
		
		
		for(Object ob:obj) {
		System.out.print(ob+"*");
		}
		
		
	}

}
