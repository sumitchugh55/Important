package com;

import java.util.Scanner;

public class Numberlength {
	public static void main(String[] args) {
		int length=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		while(number!=0) {
			length++;
			number=number/10;
		}
		System.out.println(length);
			
	}

}
