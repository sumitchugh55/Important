package com;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	int[] array= {3,5,2,9,8,7,0};
	Arrays.sort(array);
	
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
}
}
