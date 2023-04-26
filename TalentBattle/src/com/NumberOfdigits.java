package com;

import java.util.Scanner;

public class NumberOfdigits {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int length=0;
		while(number!=0) {
			length++;
			number=number/10;
			
			
		}
		System.out.println("The number of digits in the number you have entered is"+length);
	}

}
