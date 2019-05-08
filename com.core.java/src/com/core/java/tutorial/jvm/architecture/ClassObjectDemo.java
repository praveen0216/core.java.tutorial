package com.core.java.tutorial.jvm.architecture;


import java.lang.reflect.Method;

public class ClassObjectDemo {

	public static void main(String args[]) throws Exception {

		int count = 0;

		Class c = Class.forName("com.core.java.tutorial.jvm.architecture.sampleClasses.Student");
		
		Method[] method=c.getDeclaredMethods();
		
		System.out.println("Methods name: ");
		for(Method tempMethod: method) {
			count++;
			System.out.println(tempMethod.getName());
		}
		System.out.println("\nCount of methods: "+count);
	}

}
