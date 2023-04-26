package array;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int sum=0;
		int[] ar1= {1,5,7,10,2,3,8,9,6};
		int expected=ar1.length +1;
		int total_sum=expected* (expected+1)/2;
		for(int i=0;i<ar1.length;i++) {
			sum+=ar1[i];
			
		}
		System.out.println("missing number is "+(total_sum-sum));
	}

}
