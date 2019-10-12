package com.core.java8.tutorial.basics;

public class MultiThreadingTestViaRunnable {

	public static void main(String[] args) {

		System.out.println("Current Thread : "+Thread.currentThread().getName());
		System.out.println("Current Thread:+"+Thread.currentThread().getName()+ " its priority = "+Thread.currentThread().getPriority());
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
