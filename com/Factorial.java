package com;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int fact=1;
	System.out.println("Enter the number to find the factorial");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	for(int i=1;i<=number;i++) {
		fact=fact*i;
	}
	System.out.println("the factorial of the given number is\n"+fact);
}
}
