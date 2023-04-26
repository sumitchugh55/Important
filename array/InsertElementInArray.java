package array;

public class InsertElementInArray {
public static void main(String[] args) {
	int[] ar= {1,2,3,4,5};
	int position=3;
	int element =200;
//	if we want to insert a particular index the change position-1 to position
	for(int i=ar.length-1;i>position-1;i--) {
		ar[i]=ar[i-1];
	}
	ar[position-1]=element;
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	
}
}
