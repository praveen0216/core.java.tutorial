package com.core.java.tutorial.collection;
import java.util.ArrayList;
import java.util.List;


public class GenericCollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(null); // null comes under object
		int x=Integer.parseInt(null);
		
		//System.out.println(x);//NPE

		
		
	}

}
