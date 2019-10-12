package com.core.java8.tutorial.basics;

public class MultiThreadViaLambdaExpression {

	public static void main(String[] args) {
	
		Runnable r=()->{
		    Thread.currentThread().setName("baby thread");
		    Thread.currentThread().setPriority(7);
			System.out.println("Current Thread name: "+Thread.currentThread().getName());
			for(int i=0;i<10;i++) {
				System.out.println("child Thread -"+i);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread-"+i);
		}

	}

}
