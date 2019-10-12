package com.core.java8.tutorial.basics;

public class Test //implements Interf   // in case we want to override default method
{

	public static void main(String[] args) {
	
	/*
	 * Approach:1
	 * 
	 * Demo class has implemented Interface Interf . Now we can call implemented display() here
	 * 
	 * Since method is non-static , we have to create object of Demo class
	 */

		Demo d= new Demo();
		
		d.display();
		
		
		/*Approach : 2
		 * 
		 * No need to have a implemented method or separate class to implement FI
		 */
		
		Interf i=()->System.out.println("display() : without implementing in separate class");
		
		i.display();
		i.defaultX();  //default method call
		Interf.staticX(); //static method call
		
		
		Test.staticX();
		
		
	}

	
	/*
	 * We can override default methood and but not static method
	 * We can use same static method as normal method
	 * 
	 * For this we have to use implements keyword and then override default method
	 * if we do not want to use child default method then call parent default method
	 * by <Parent Interface name>.super.<default method name> as given below
	 */
	/*
	 * @Override public void display() {
	 * 
	 * Interf.super.defaultX();;
	 * 
	 * }
	 */
	  public static void staticX() {
			System.out.println("static method : Test class");
		}

}
