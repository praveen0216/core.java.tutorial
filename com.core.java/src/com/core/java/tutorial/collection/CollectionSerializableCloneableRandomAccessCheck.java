package com.core.java.tutorial.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.io.Serializable;
import java.util.LinkedList;


public class CollectionSerializableCloneableRandomAccessCheck {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();
		List l=new ArrayList();
		
		System.out.println("Check instrance of ArrayList ");
		System.out.println(al instanceof RandomAccess); //true
		System.out.println(al instanceof Cloneable); //true
		System.out.println(al instanceof Serializable); //true
		
		
		System.out.println();
		
		System.out.println("Check instrance of List ");
		System.out.println(l instanceof RandomAccess);//true
		System.out.println(l instanceof Cloneable); //true
		System.out.println(l instanceof Serializable); //true
		
		LinkedList ll=new LinkedList();
		System.out.println("Check instrance of LinkedList ");
		System.out.println(ll instanceof RandomAccess); //false
		System.out.println(ll instanceof Cloneable); //true
		System.out.println(ll instanceof Serializable); //true
		
		System.out.println("Check instrance of Vector ");
		Vector v=new Vector();
		System.out.println(v instanceof RandomAccess); //True
		System.out.println(v instanceof Cloneable); //True
		System.out.println(v instanceof Serializable); //True
		
		System.out.println("Check instrance of Stack ");
		Stack s=new Stack();
		System.out.println(s instanceof RandomAccess); //True
		System.out.println(s instanceof Cloneable); //True
		System.out.println(s instanceof Serializable); //True
		
		System.out.println("Check instance of HashSet");
		Set set=new HashSet();
		System.out.println(set instanceof RandomAccess); //false
		System.out.println(set instanceof Cloneable);//True
		System.out.println(set instanceof Serializable);//true
		
		/* How to synchronize different cololections
		 * 
		 * 
		 * List l1=Collections.synchronizedList(l);
		 * 
		 * Collection al1=Collections.synchronizedCollection(al);
		 * 
		 * ArrayList al2=(ArrayList)al1;
		 * 
		 * Set al3= (Set)al1;
		 * 
		 * Set al4=Collections.synchronizedSet(al3);
		 */
	}

}
