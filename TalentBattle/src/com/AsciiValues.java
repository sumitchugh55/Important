package com;

import java.util.Scanner;

public class AsciiValues {
	public static void main(String[] args) {
		System.out.println("Enter the character value");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int c=ch;
		System.out.println("The ASCII value of given character is \n"+c);
	}

}
