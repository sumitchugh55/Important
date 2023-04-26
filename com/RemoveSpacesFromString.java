package com;

import java.util.Scanner;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String str1=str.replace(" ", "");
		System.out.println(str1);
	}

}
