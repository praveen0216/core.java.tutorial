package com.core.java8.tutorial.basics;

public class MainOverloading {

	public static void main(String[] args) {
	
		System.out.println("Main");
		main(10);
		main(12,13);
	}

	public static void main(int a) {
		System.out.println("int ");

	}
	
	public static void main(int... a) {
		System.out.println("var int");

	}

}
