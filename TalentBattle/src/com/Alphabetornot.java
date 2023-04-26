package com;

import java.util.Scanner;

public class Alphabetornot {
	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if((ch>='A'&&ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println("Is an alphabet");}
			else
				System.out.println("Is not an alphabet");
		}
	}

