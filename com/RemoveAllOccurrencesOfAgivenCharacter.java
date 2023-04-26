package com;

import java.util.Scanner;

public class RemoveAllOccurrencesOfAgivenCharacter {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		
String newstr=str.replace( "a", "");
System.out.println(newstr);
	}

}
