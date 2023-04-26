package comm;

public class Sumofnumber {
	public static void main(String[] args) {
		int number=1239;
		//6
		int sum=0;
		while (number!=0) {
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		System.out.println(sum);
	}

}
