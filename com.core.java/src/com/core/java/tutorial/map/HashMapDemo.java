package com.core.java.tutorial.map;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> m=new HashMap<String,Integer>();
		m.put("A",1);
		m.put("B",2);
		m.put("C",3);
		m.put("D",4);
		m.put("E",5);
		
		System.out.println(m);
		System.out.println("Updating in C 3 to 30 : return "+m.put("C",30));
		System.out.println(m);
		
		//m.put(null, 0);
		System.out.println(m);
		
		Set s=m.keySet();
		Iterator itr1=s.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set entrySet=m.entrySet();
		Iterator itr2=entrySet.iterator();
		
		while(itr2.hasNext()) {
			Map.Entry m1=(Map.Entry)itr2.next();
			
			
			  if(m1.getKey().equals("C")) { m1.setValue(300); }
			 
			System.out.println("Key :"+m1.getKey()+"  Value :"+m1.getValue());
		}		

	}

}
