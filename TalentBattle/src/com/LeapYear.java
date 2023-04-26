package com;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year in YYYY Format");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0)
			
			System.out.println("the year is a leap year");
		else
			System.out.println("not a leap year");
	}

}
