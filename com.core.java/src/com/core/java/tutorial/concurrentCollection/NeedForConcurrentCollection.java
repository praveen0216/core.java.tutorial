package com.core.java.tutorial.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class NeedForConcurrentCollection extends Thread{
	
	static ArrayList al=new ArrayList();
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Child Thread Updating");
			al.add("D");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		al.add("A");
		al.add("B");
		al.add("C");
		
		NeedForConcurrentCollection thread=new NeedForConcurrentCollection();
		thread.start();
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			String s1=(String) itr.next();
			System.out.println("Main Thread iterating list and current object : "+s1);
			Thread.sleep(5000);
		}
		System.out.println(al);
	}

}
