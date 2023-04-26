package array;

public class MaxArray {
	public static void main(String[] args) {
		int[] arr= {1,2,7,3,4,5,6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		
		}
		System.out.println(max);
	}

}
