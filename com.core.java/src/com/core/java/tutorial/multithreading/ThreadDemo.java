package com.core.java.tutorial.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//#test1
		/*
		 * MyThread t=new MyThread(); t.start();
		 * 
		 * for(int i=0;i<10;i++) { System.out.println("main Thread"); }
		 */
		
		//#test2
		/*
		 * MyThreadWithRunOverloading t=new MyThreadWithRunOverloading(); t.start();
		 * t.run(5);
		 */
		
		//#test3
		/*
		 * MyThreadWithNoRunOverloading t=new MyThreadWithNoRunOverloading(); t.start();
		 */
		
		//#test4
		/*
		 * MyThreadWithStartOverloading t=new MyThreadWithStartOverloading(); t.start();
		 * 
		 * System.out.println("main-method");
		 */
		
		//#test5
		/*
		 * MyThread t=new MyThread(); t.start(); t.start();
		 * //IllegalThreadStateException
		 */	
		
		//#test6
		
		System.out.println("current thread : "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("Praveen");
		
		System.out.println("current thread : "+Thread.currentThread().getName());
		
		System.out.println("current thread priority : "+Thread.currentThread().getPriority());
		
		MyRunnable r=new MyRunnable();
		
		Thread t=new Thread(r);
		t.start();
		t.currentThread().setPriority(10);
		System.out.println("current thread priority : "+Thread.currentThread().getPriority());
		
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
		}
		

	}

}
