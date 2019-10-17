package com.core.java.OopsConcept;

public class Child extends Parent {

	public int c=11;
	public static void c1() {
		System.out.println("child-c1()");
	}
	
	public void c2() {
		System.out.println("child-c2()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj=new Child();
		obj.m2();
		obj.m1();
		
		Child c=new Child();
		c.m2();
		c.m1();
		c.c2();
		c.c1();
		
		System.out.println(c.x);
		System.out.println(obj.x);
		System.out.println(c.c);
		
		
		
		
		
	}

	
}
