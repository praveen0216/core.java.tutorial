package com.core.java.OopsConcept;
/*
 * if all 4 methods are available then the output will be same as commented besides method call
 * 
 * if (int a) method is absent then output for argument (10) is wrapper method
 * 
 * if(int a) , (Integer a) methods are absent then output for argument(10) will be object method
 * 
 * if(int a),(Integer a), (Object a) are absent then for argument (10) output will be var-arg method
 * 
 */
public class WrapperPrimitiveOverloading {

	public static void main(String[] args) {
	
		WrapperPrimitiveOverloading.display(10); // primitive method
		
		WrapperPrimitiveOverloading.display(new Integer(12)); // wrapper method

		WrapperPrimitiveOverloading.display((Object)10); // object method
		
		WrapperPrimitiveOverloading.display(12,15,16); // var arg method
		
	}
	
	
	  public static void display(int a) {
	  System.out.println("inside primitive method : value "+a); }
	 
	
	
	  public static void display(Integer a) {
	  System.out.println("inside Wrapper method : value "+a);
	  
	  }
	 
	
	public static void display(int... a) {
		for(int temp:a) {
		System.out.println("inside var-arg method : value "+temp);
		}
	}

	
	  public static void display(Object a) {
	  System.out.println("inside Object method : value "+a); }
	 
}
