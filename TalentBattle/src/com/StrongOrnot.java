package com;

public class StrongOrnot {
	public static void main(String[] args) {
	int sum=0;
		int remainder;
		int number=2;
		int temp=number;
		while(number!=0) {
		remainder=number%10;
		int fact =1;
		for(int i=1;i<=remainder;i++) {
			fact=fact *i;
		}
		sum=sum+fact;
		number=number/10;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("Strong number");
		}
		else
			System.out.println("not strong");
	}

}
