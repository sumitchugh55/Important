package com;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			throw new ArithmeticException("Access Denied you must be atleast 18 years old");
		
		}
		else
			System.out.println("You are allowed");
		System.out.println("you can drink");
	}

}
