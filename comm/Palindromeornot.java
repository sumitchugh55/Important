package comm;

public class Palindromeornot {
	public static void main(String[] args) {
		int number=121;
		int t1=number;
		int reverse=0;
		while(t1!=0) {
			int remainder=t1%10;
			reverse=reverse*10 +remainder;
			t1=t1/10;
			
			
		}
		if(reverse==number)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
