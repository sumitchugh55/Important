package comm;

import java.util.Scanner;

public class Stringpalindrome {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	
	String reverse="";
	
for(int i=str.length()-1;i>=0;i--) {
	reverse=reverse+str.charAt(i);
}
	if(str.equals(reverse)) {
		System.out.println("the String is palindrome");
	}
	else
		System.out.println("Not a Plaindrome");
}
}
