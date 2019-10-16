package com.core.java8.tutorial.basics;

public class Employee {
	
	private int age;
	
	Employee(){
		System.out.println("Default Constructor");
	}

	Employee(int age){
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " age=" + age + " ";
	}
	
	
}
