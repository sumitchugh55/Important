package com;

import java.util.Scanner;

public class SwapUsingThird {
	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the new value of a is :"+a);
		System.out.println("the new value of b is"+b);
		
	}

}
