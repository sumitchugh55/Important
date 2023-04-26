package comm;

import java.util.Arrays;

public class TwoArrayEqual {
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7};
		int[] ar1= {7,6,5,4,3,2,8};
		Arrays.sort(ar);
		Arrays.sort(ar1);
		boolean equal=Arrays.equals(ar, ar1);
		if(equal) {
			System.out.println("equal");
		}
		else
			System.out.println("not");
	}
}
