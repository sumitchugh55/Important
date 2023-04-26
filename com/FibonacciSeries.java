package com;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int number;
		System.out.println("Enter the number where you want to find");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<number;i++) {
		
		c=a+b;//1
		a=b;
		b=c;
		
		System.out.println(c);
		}
	}

}
