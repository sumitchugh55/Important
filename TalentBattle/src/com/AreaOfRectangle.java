package com;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		System.out.println("Enter the length and breadth");
		Scanner sc=new Scanner(System.in);
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		
		float area=length* breadth;
		System.out.println("the area of rectangle is \n"+area);
	}

}
