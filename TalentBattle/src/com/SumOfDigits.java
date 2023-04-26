package com;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();//324
		int sum=0;
	
		int remainder=0;
		while(number!=0) {
			
			remainder=number%10;
			sum+=remainder;
			number=number/10;
			
			
		}
		System.out.println("the sum of the digits are"+sum);
	}

}
