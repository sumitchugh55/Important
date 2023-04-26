package com;

import java.util.Scanner;
//using single pass traversal approach
public class SecondLargestInArrayExample{  
	public static void main(String[] args) {
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		int i=0;
		System.out.println("Enter the arraylength");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("Enetr the array elements");
		int arr[]=new int[number];
		
		for( i=0;i<number;i++) {
			System.out.println("Enter the element of index"+i);
			arr[i]=sc.nextInt();
		}
		
		for( i=0;i<number;i++)
		if(arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}
		else
		{
		if(arr[i]>secondlargest && arr[i]<largest) {
			secondlargest=arr[i];
		}
		}
	System.out.println(secondlargest);
	}
}