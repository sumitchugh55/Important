package com;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int ascii=ch;
		System.out.println("the Ascii value of"+ch +"is"+ascii);
		sc.close();
	}

}
