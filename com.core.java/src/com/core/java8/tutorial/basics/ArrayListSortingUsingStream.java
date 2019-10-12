package com.core.java8.tutorial.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
public class ArrayListSortingUsingStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(2);
		al.add(109);
		al.add(68);
		
		int ran;
		for(int i=0;i<8;i++) {
			al.add( (int)(Math.random()*10));
			
		}
		/*
		 * al.stream().forEach(System.out::print); System.out.println();
		 * Comparator<Integer> c=(I1,I2)->(I1<I2)?1:(I1>I2)?-1:0;
		 * Collections.sort(al,c); al.stream().forEach(System.out::print);
		 */
		
		

	}

}
