package com;
import java.util.Scanner;

class LinearSearch {
	
	static int search(int arr[],int x)
	{
		for (int i = 0; i <arr.length ; i++) {
			
			if (arr[i] == x)
				return i;
		}

		
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 4, 1, 7, 5 };
		
		
		
        System.out.println("Enter The number To be find");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();

		int index = search(arr, x);
		if (index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at position " + index);
	}
}
