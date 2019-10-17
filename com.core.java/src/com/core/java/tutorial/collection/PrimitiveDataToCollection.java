package com.core.java.tutorial.collection;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveDataToCollection {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {

		/*
		 * //demo: 1
		 * 
		 * List l=new ArrayList(); l.add(new Customer()); l.add(new Student());
		 * 
		 * l.add("String Object"); l.add(10); l.add(10.98f); l.add(12.67); l.add('e');
		 * 
		 * System.out.println(l);
		 */

		/*
		 * //demo: 2
		 * 
		 * char c='e';
		 * 
		 * System.out.println((int)c);
		 */

		/*
		 * //demo : 3
		 * 
		 * char[] z= {'x', 'y','z'}; System.out.println(z);
		 * 
		 * for(char tempChar:z) { System.out.println(tempChar); }
		 */

		/*
		 * //demo: 4
		 * 
		 * char[] z= {'x', 'y','z'}; String str=z;// cannot convert from char[] to
		 * String
		 */

		/*//demo: 5
		 * 
		 * String str="hello viper"; System.out.println(str);
		 * 
		 * //chances of exception try { System.out.println(str.charAt(100)); }
		 * catch(Exception e) { throw new
		 * StringIndexOutOfBoundsException("hey man Exception"); }
		 * catch(StringIndexOutOfBoundsException e) {
		 * System.out.println("shit!! Exception is caught "+e.getMessage()); }
		 */
		
		//demo: 6
		String str="hey mam can you hold on for a second";
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder(str);
		sb.append('v');
		System.out.println(sb);
		System.out.println(sb instanceof java.lang.StringBuilder);
		
		char[] ch= {'a','b','c'};
		sb.append(ch);
		System.out.println(sb);
		System.out.println(new char[] {'m','n','p'});
		sb.append(new char[] {'m','n','p'});
		System.out.println(sb);
		
		String str1=" no no";
		str.concat(str1);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.concat(str1));
		System.out.println("str "+str.hashCode() + "\n str1 "+str1.hashCode()+" \n str.concat(str1) "+str.concat(str1).hashCode());
		System.out.println("adding hashcode str+ str1"+str.hashCode()+str1.hashCode());//hascode are not added but concatenated;
		

		String s=new String(sb);
		System.out.println("String buffer to String "+s);
		
		
	}

}
