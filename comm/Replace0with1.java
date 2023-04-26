package comm;

import java.util.Scanner;

public class Replace0with1 {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	//201
	String str=Integer.toString(number);
	String str1="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='0') {
			str1=str1 +1;
		}
		else
		{
			str1=str1+str.charAt(i);
		}
	}
	System.out.println(str1);
}
}
