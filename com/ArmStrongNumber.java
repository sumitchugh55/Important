package com;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int length=0;
		int t1=number;
		int arm=0;
		int t2=number;
		while(t1!=0) {
			length=length+1;
			t1=t1/10;
		}
		
		while(t2!=0) {
			int remainder=t2%10;
			int mul=1;
			
			for(int i=1;i<=length;i++) {
				mul=mul*remainder;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(number==arm) {
			System.out.println("the given number is an ArmStrong number");
		}
		else
			System.out.println("not an Armstrong");
		
		
	}

}
