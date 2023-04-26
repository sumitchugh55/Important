package com;

import java.util.Scanner;

public class NoOfVowelsConsonant {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{	vowel++;
				}
				else
				{
					consonant++;
					
				}
		}
		System.out.println("number of consonants="+consonant);
		System.out.println("number of vowels="+vowel);
	}

}
