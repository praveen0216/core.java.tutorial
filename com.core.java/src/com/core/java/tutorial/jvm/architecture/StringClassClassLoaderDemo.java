package com.core.java.tutorial.jvm.architecture;

public class StringClassClassLoaderDemo {

	public static void main(String[] args) {
	
		System.out.println(String.class.getClassLoader());
		System.out.println(com.core.java.tutorial.jvm.architecture.sampleClasses.Student.class.getClassLoader());

	}

}
