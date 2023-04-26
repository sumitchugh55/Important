package com;

import java.util.Scanner;

public class DoubleOfNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//useing left shift operator to left shift by one bit
		
		System.out.println(number<<1);
		//5*2^1=10
		System.out.println(number<<2);
		//5*2^2=5*4;
		
		//5*2^3
		System.out.println(number<<3);
		
	}

}
