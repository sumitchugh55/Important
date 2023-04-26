package throws1;

import java.util.Scanner;

class YoungerAgeException extends Exception{
	 YoungerAgeException(String msg){
		 super(msg);
	 }
	 public YoungerAgeException() {
		// TODO Auto-generated constructor stub
		 super();
	}
}
public class Voting {
	public static void main(String[] args)throws YoungerAgeException {
		System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new YoungerAgeException("You are not eligible for voting");
			}
			else
			{
				System.out.println("You can vote");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		System.out.println("hello");
		
		
	}

}
