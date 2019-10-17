package com.core.java.tutorial.collection;

public class Student {

	private String name;
	private int age;
	private int rollNo;
	
	Student (){
		this.name=null;
		this.age=0;
		this.rollNo=-1;
	}
	
	Student(String name,int age, int rollNo){
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
	}

	/*
	 * @Override
	 * public int hashCode() { 
	 * 
	 * final int prime = 31; 
	 * int result = 1;
	 * result = prime * result + age;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode()); 
	 * result = prime * result + rollNo;
	 * return result; 
	 * }
	 * 
	 * @Override
	 *  public boolean equals(Object obj) {
	 *  if (this == obj) return true;
	 * if (obj == null) return false; 
	 * if (getClass() != obj.getClass()) return false; 
	 * Student other = (Student) obj; 
	 * if (age != other.age) return false; 
	 * if (name == null) { 
	 * if (other.name != null) return false;
	 *  } else if (!name.equals(other.name)) return false;
	 *   if (rollNo != other.rollNo) return false; 
	 *   return true; }
	 */
	
	
}
