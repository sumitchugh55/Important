package com;

import java.util.Arrays;
import java.util.Collections;
class Maxofarray{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		
		}
		System.out.println("the max element is "+max);
	}
}