package comm;

import java.util.Scanner;

public class PrimeOrnot {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
			
			
			
			
		}
		if(count>1) {
			System.out.println("the number is not prime");
		}
		else
			System.out.println("prime");
	}

}
