package com;

import java.util.Scanner;

public class Stringpalidrome {
	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter the String value");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str;
		
		for(int i=str1.length()-1;i>=0;i--) {
			reverse=reverse +str1.charAt(i);
			
		}if(reverse.equals(str)) {
			System.out.println("The string is plaindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
