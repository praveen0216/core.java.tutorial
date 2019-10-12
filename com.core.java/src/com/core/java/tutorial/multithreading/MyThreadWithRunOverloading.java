package com.core.java.tutorial.multithreading;

public class MyThreadWithRunOverloading extends Thread {
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("no-arg run");
		}
	}
	
	public void run(int i) {
		System.out.println("int arg run");
	}

}
