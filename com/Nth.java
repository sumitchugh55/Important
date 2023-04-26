package com;

import java.util.Arrays;

public class Nth {
	public static void main(String[] args) {
		int[] array= {1,2,4,3,8,7,7,7};
		int k=4;
		int temp=0;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
	}
		System.out.println(array);
		
		Arrays.sort(array);
		System.out.println(array[array.length-k]);
		
	}

}
