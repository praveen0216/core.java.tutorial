package com.core.java.tutorial.collection;

import java.util.stream.*;
public class ArrayDemo {

	private final static int SIZE=10;
	
	public static void main(String[] args) {
		
		//Initialising student
		Student[] student=new Student[SIZE];
		int loop=0;
		while(loop<SIZE) {
			student[loop]=new Student("Student-"+loop,15,loop);
			loop++;
		}
		
		//Initialising customer
		Customer[] customer=new Customer[SIZE];
		 loop=0;
		while(loop<SIZE) {
			customer[loop]=new Customer("Customer-"+loop,loop);
			loop++;
		}
		
		display(student);
		display(customer);
		
		Object[] obj=new Object[SIZE*2];
		loop=0;
		while(loop<obj.length) {
			obj[loop]=loop<SIZE?student[loop]:customer[loop-10];
			loop++;
		}
		
	System.out.println("--------------------------------------------------------------------------------------------------");
	
	for(Object o:obj) {
		System.out.print("Student ? ");
		System.out.println(o instanceof Student);
		System.out.print("Customer ? ");
		System.out.println(o instanceof Customer);
	}
	
	}

	private static void display(Object[] object) {
		
		int length=object.length;
		
		if(object[0] instanceof Customer) {
			
			
			for(Customer tempCustomer:(Customer[])object ) {
				
				System.out.println(tempCustomer.toString());
				
			}
			
		}
		
		if(object[0] instanceof Student) {
			
			
			for(Student tempStudent:(Student[])object ) {
				
				System.out.println(tempStudent.toString());
				
			}
			
		}
		
	}
	
}
