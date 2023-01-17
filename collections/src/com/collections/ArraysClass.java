package com.collections;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		int [] arr = {1,2,3,10,5,15,7,8,9,1,0};
		Arrays.sort(arr);
//		int search = Arrays.binarySearch(arr, 3);     // for applying binary search algorithm
//		System.out.println(search);
		
//		Arrays.fill(arr, 2);                // jb array ke saare elements me koi ek hi value add krni ho.
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		

	}

}
