package com.core.java8.tutorial.basics;
import java.util.function.Consumer;
import java.util.function.Function;
public class LambdaExpressionDemo {

	/* to call m() non static method ,we have create object reference and then call
	 *  
	 * 
	 * public void m() { System.out.println("Hello"); }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * LambdaExpressionDemo d= new LambdaExpressionDemo(); d.m();
	 * 
	 * 
	 * }
	 */

	
	//With java 8 m() {] can be replaced by lambda expression
	
	public static void main(String[] args)
	{
		//Consumer<Void> c=()->System.out.println("Hello"); //not working
		
		/*
		 * Consumer<String> cs= s->System.out.println(s.length()); cs.accept("hello"); //working 
		 */
		
		//Function<String,Void> f=s->System.out.println(s.length()); //not working
	
		
	}
}



