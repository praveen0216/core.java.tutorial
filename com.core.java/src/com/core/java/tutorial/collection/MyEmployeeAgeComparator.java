package com.core.java.tutorial.collection;
import java.util.Comparator;

public class MyEmployeeAgeComparator implements Comparator {
	
	public int compare(Object ob1,Object ob2) {
		
		Employee e1=(Employee) ob1;
		Employee e2=(Employee) ob2;
		
		int age1=e1.getAge();
		int age2=e2.getAge();
		
		return (age1>age2)?1:(age2>age1)?-1:0;
	}

}
