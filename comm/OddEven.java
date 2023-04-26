package comm;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
