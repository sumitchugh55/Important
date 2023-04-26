package com;

import java.util.Arrays;

public class TwoArrayContainSameElement {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int[] arr1= {5,4,3,2,1,6};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		boolean equal=Arrays.equals(arr, arr1);
		System.out.println(equal);
	}

}
