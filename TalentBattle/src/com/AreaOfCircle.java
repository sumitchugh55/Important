package com;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter the radius");
		Scanner sc=new Scanner(System.in);
		float radius=sc.nextFloat();
		
		double area=3.14* radius*radius;
		System.out.println("the area of the circle is"+area);
	}
}