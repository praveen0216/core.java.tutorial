package com.core.java8.tutorial.basics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeOperations {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
	List<Employee> l=new ArrayList<Employee>();
	
	l.add(new Employee(10));
	l.add(new Employee(98));
	l.add(new Employee(89));
	l.add(new Employee(15));
	l.add(new Employee(54));
	l.add(new Employee(9));
	l.add(new Employee(25));
	l.add(new Employee(32));
	l.add(new Employee(44));
	l.add(new Employee(59));
	l.add(new Employee(76));
	
	List e=l.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList());
	
	
	@SuppressWarnings("unchecked")
	LinkedList ll=new LinkedList(e);
	
	System.out.println(ll.toString());
	
	ListIterator ltr=ll.listIterator();
	while(ltr.hasNext()) {
		System.out.print(ltr.next().toString()+"  ");
	}

	}

}
