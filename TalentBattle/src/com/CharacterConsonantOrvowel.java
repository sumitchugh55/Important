package com;

import java.util.Scanner;

public class CharacterConsonantOrvowel {
	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("the entered input is vowel");}
			else if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
				System.out.println("the entered input is consonant");
			else
				System.out.println("Wrong input");
		}
	}


