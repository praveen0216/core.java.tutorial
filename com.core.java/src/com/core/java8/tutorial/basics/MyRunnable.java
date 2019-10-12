package com.core.java8.tutorial.basics;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
	
		System.out.println("Child thread name "+Thread.currentThread().getName()+ " it's priority ="+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

}
