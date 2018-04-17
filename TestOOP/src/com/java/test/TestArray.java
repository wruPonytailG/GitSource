package com.java.test;
import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		double[] myList = new double[10];
		String[] intList = new String[10];
		
		int total = 0;

		for (int i = 0; i < myList.length; i++) {
			myList[i] = i;

			total += myList[i];

		}
		System.out.println(total);
		
		intList[1] = "2222";
		
		System.out.println(intList[1]);
		
//		for(double e: myList){
//			System.out.println(e);
//		}
		
		System.out.println(Arrays.binarySearch(myList, 3.0));
		
	}
}
