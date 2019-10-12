package com.core.java8.tutorial.basics;

/*
 * if interface is not Functional interface then we cannot store lambda expression
 * and it will act similar to normal interface. which we have implement , 
 * default method and static method are not required to be implemented
 * but we can always override default method and static method
 * 
 * 
 * If Interf is a Functional interface then not requred to use implements 
 */


public class LambdaDemo {

	public static void main(String[] args) {
		
		Interf i=()->System.out.println("Hello");
		
		i.display();
		i.defaultX();
		Interf.staticX();
		 
		
	}


	
	
}
