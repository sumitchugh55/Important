package com;

public class Mininarray {
	public static void main(String[] args) {
		int[] arr= {8,10,-20,12,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
