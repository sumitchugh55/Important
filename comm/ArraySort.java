package comm;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	
	
	
	int[] arr= {1,2,3,4,5,6,0};
	Arrays.sort(arr);
//	
//	System.out.println("sorted array"+Arrays.toString(arr));
	for(int i:arr) {
		System.out.println(i);
	}
}
}