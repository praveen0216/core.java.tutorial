package com.core.java.tutorial.collection;

public class Customer {
	
	private String CustomerName;
	private int CustomerId;
	
	public Customer(){
		
	}

	public Customer(String CustomerName,int CustomerId ) {
		
		this.CustomerId=CustomerId;
		this.CustomerName=CustomerName;
		
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + "]";
	}
	
	
	
}
