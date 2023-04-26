package com;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<number;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
