package com;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the base value");
		Scanner sc=new Scanner(System.in);
		float base=sc.nextFloat();
		System.out.println("Entert the height value");
		float height=sc.nextFloat();
		
		double area=(base*height)/2;
		System.out.println("the area of triangle is equal to\n"+area);
		
	}

}
