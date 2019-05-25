package com.core.java.tutorial.jvm.architecture;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassObjectDemo {

	public static void main(String args[]) throws Exception {

		 int count = 0;

		Class c = Class.forName("com.core.java.tutorial.jvm.architecture.sampleClasses.Student");
		
		Method[] method=c.getDeclaredMethods();
		
		Field[] fields=c.getFields();
		
		System.out.println("Methods name: ");
		for(Method tempMethod: method) {
			count++;
			System.out.println(tempMethod.getName());
		}
		System.out.println("\nCount of methods: "+count);
		
		System.out.println("fields count ="+fields.length);
		System.out.println("\nFields are :");
		
		for(Field tempField: fields) {
			count++;
			System.out.println(tempField.getName());
		}
		
		
		
		
	}

}
