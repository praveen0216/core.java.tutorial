package com.core.java8.tutorial.basics;
import java.util.function.Predicate;

public class EvenCheck {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println("check 45 is even ? "+p.test(45));
		
		System.out.println("check 100 is even ? "+p.test(100));
	}

}
