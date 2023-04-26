package array;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,4,5,6};
		int[] b= {1,2,4,8};
		int a_length=a.length;
		int b_length=b.length;
		
		int c_length=a_length+b_length;
		int[] c=new int[c_length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int element:c) {
			System.out.println(element);
		}
	}

}
