package array;

public class RemoveSpecificElementFromArray {
	public static void main(String[] args) {
		int[] ar1 = { 1, 5,3,2,1 };
		int del_element = 5;
		int count=0;
		for (int i = 0; i < ar1.length; i++) {
			if (del_element == ar1[i]) {
                
				for (int j = i; j < ar1.length - 1; j++) {
					ar1[j] = ar1[j + 1];
				}
				count=count+1;
				break;
			}
		}
		if(count==0) {
			System.out.println("Element not deletd");
		}
		else {
			System.out.println("element deleted successfuly");
		    for(int i=0;i<ar1.length-1;i++) {
			System.out.println(ar1[i]);
		}
		}
	}

}
