package com.core.java8.tutorial.basics;

import java.util.function.*;
public class Square {

	/*
	 * Without java 8
	 * 
	 * 
	 * public static void main(String[] args) {
	 * System.out.println("square of a number  = "+squareIt(10)); }
	 * 
	 * public static int squareIt(int a) { return a*a; }
	 */
	
	//With Java 8 LAmbda function
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(10));
		
	}
	
	
}
