package com.core.java.tutorial.multithreading;

public class MyThreadWithStartOverloading extends Thread {
	
	public void run() {
		System.out.println("run -method");
		
	}
	
	public void start() {
		super.start();
		System.out.println("start method");
	}
	
	
}
