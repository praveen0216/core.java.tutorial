package com.core.java8.tutorial.basics;

@FunctionalInterface
public interface Interf {
	
	public void display();
	
	
	default void defaultX() {
		
	System.out.println("default method");

	}

	public static void staticX() {
		System.out.println("static method");
	}
	
}
