package com;

public class LinearSearch1 {
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		int key=4;
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				System.out.println("the element"+key+"found at index:"+i);
			break;}
			else
				System.out.println("not found");
		}
		
		
	}
}
