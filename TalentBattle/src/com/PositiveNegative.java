package com;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number>0)
			System.out.println("The number is positive");
		else if(number==0)
			System.out.println("The number is neighter postive nor negative");
		else
			System.out.println("the number is negative");
	}

}
