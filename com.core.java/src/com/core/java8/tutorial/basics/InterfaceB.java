package com.core.java8.tutorial.basics;

/*
 * DEmostration of Functional Interface behaviour w.r.t inheritance
 */

/*
 * It is not mandatory to annotate  this interface with @FunctionalInterface 
 * however after having this annotation will determine whether the given interface is Functional Interface or not 
 * 
 */
@FunctionalInterface
public interface InterfaceB  extends InterfaceA{

	void mA(); // abstract method which is overriden 
	
	// void mA1(); // If this is uncommented then InterfaceB will not be Functional Interface as more tyhan one abstract method
	
	default void mB1() {
		System.out.println("default method mB1");
	}
	
	default void mB2() {
		System.out.println("default method mB2");
	}
	
	/*
	 * We have main() method in the interface. Now we can also run interface by keeping main() method in interface
	 * 
	 * main(String[] args) is also a type of static method
	 * '
	 * we can overload main() method. but this will act like a normal method
	 */
	
	static void main(String[] args) {
		
		InterfaceB b=()-> System.out.println("hello --B"); // Lambda expression-1
		b.mB1();
		b.mA(); // child Interface mA() is executed as implementation is provided by ablove lambda expression-1
	
		InterfaceA a=()->System.out.println("hello --A"); //Lambda expression-2
		
		a.mA(); // It will execute above lambda expression-2 , as the implementation is provided by this expression. 
		
		//a.main(); we cannot call static method like this
		
		InterfaceB.main(); // <Interface Name>.<method name>(<argument list>); // This is how we can call
		
		System.out.println("return from main(int a) --> "+InterfaceB.main(10));
	}
	
	static void main() {
		System.out.println("Overloaded main() method ");
	}
	
	static int main(int a) {
		System.out.println("Overloaded main(int a) method");
		return a;
	}
}
