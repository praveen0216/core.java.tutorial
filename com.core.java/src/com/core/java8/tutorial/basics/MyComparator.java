package com.core.java8.tutorial.basics;
import java.util.Comparator;
public class MyComparator implements Comparator<Integer> {
	

	@Override
	public int compare(Integer I1, Integer I2) {
		// TODO Auto-generated method stub
		return (I1<I2)?1:(I1>I2)?-1:0;
	}

}
