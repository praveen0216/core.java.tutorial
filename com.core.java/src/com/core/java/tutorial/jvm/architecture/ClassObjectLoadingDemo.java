package com.core.java.tutorial.jvm.architecture;

import com.core.java.tutorial.jvm.architecture.sampleClasses.Student;

public class ClassObjectLoadingDemo {
	
	/*
	 * for every loaded type only one class object will be created even though we
	 * are using the class multiple times in our program
	 */

	public static void main(String[] args) {
		
		Student student1=new Student();
		Class c1=student1.getClass();
		
		Student student2=new Student();
		Class c2=student2.getClass();
		
		System.out.println("c1 hashCode ="+c1.hashCode());
		System.out.println("c2 hashCode ="+c2.hashCode());
		System.out.println("c1==c2 ? "+(c1==c2));
		
		
		

	}

}
