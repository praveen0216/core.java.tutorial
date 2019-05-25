package com.core.java.tutorial.jvm.architecture;

public class HeapMemoryStatisticsDemo {

	public static void main(String[] args) {
		
		long mb=1024*1024;
		
		Runtime r =Runtime.getRuntime();
		System.out.println("max memory : "+r.maxMemory());
		System.out.println("Initial memory : "+r.totalMemory());
		System.out.println("Free memory : "+r.freeMemory());
		System.out.println("Consumed memory : "+(r.totalMemory() - r.freeMemory()));
		
		System.out.println("available processor "+r.availableProcessors());
		
		System.out.println("\nmemory in mb : integral");
		
		System.out.println("max memory : "+r.maxMemory()/mb);
		System.out.println("Initial memory : "+r.totalMemory()/mb);
		System.out.println("Free memory : "+r.freeMemory()/mb);
		System.out.println("Consumed memory : "+(r.totalMemory() - r.freeMemory())/mb);
		
		System.out.println("\nmemory in mb : double");
		
		double mbf=1024*1024;
		System.out.println("max memory : "+r.maxMemory()/mbf);
		System.out.println("Initial memory : "+r.totalMemory()/mbf);
		System.out.println("Free memory : "+r.freeMemory()/mbf);
		System.out.println("Consumed memory : "+(r.totalMemory() - r.freeMemory())/mbf);


	}

}
