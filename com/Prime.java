package com;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter any number to check");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				count ++;
			}
		}
		if(count>1) {
			System.out.println("The number is not prime");
		}
		else if(number==0||number==1)
			System.out.println("the number is not prime");
		else
			System.out.println("the number is prime");
	}
	

}
