package com;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse +str.charAt(i);
		}
		System.out.println("the Reversed String is\n"+reverse);
	}

}
