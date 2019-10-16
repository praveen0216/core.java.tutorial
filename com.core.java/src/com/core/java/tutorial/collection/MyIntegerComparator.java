package com.core.java.tutorial.collection;
import java.util.Comparator;
public class MyIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1,Integer I2) {
		//return (I1<I2)?1:(I1>I2)?-1:0; //Desc
		return -I1.compareTo(I2); //Desc  Using compareTo()
	}

}
