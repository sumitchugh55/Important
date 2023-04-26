package com;

import java.util.Scanner;

public class Maximumhandshakes {
	public static void main(String[] args) {
		System.out.println("Enter the number of people in the room");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int total=number*(number-1)/2;
		System.out.println(total);
	}

}
