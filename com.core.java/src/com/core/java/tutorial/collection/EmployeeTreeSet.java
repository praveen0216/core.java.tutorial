package com.core.java.tutorial.collection;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		
		System.out.println("Employee sorted by age");
		TreeSet<Employee> ageSorted=new TreeSet<Employee>(new MyEmployeeAgeComparator());
		ageSorted.add(new Employee(27,"Srinivas"));
		ageSorted.add(new Employee(23,"Praveen"));
		ageSorted.add(new Employee(32,"Deepak"));
		ageSorted.add(new Employee(15,"Anish"));
		
		//System.out.println(ageSorted.add(new Employee(15,"Anish"))); //false
		
		System.out.println(ageSorted);
		
		System.out.println("\nEmployee sorted by name");
		TreeSet<Employee> nameSorted=new TreeSet<Employee>(new MyEmployeeNameComparator());
		nameSorted.add(new Employee(27,"Srinivas"));
		nameSorted.add(new Employee(23,"Praveen"));
		nameSorted.add(new Employee(32,"Deepak"));
		nameSorted.add(new Employee(15,"Anish"));
		
		System.out.println(nameSorted);
	}

}
