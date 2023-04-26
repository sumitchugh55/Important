package array;

import java.util.ArrayList;

public class OddEvenInArray {
	public static void main(String[] args) {
     int[] ar= {1,2,3,4,5,6};
     ArrayList<Integer> al1=new ArrayList<>();
     ArrayList<Integer> al2=new ArrayList<>();
     for(int i=0;i<ar.length;i++) {
    	 
    	 if(ar[i]%2==0) {
    		 
    		 al1.add(ar[i]);
    	 }
    	 else
    		 al2.add(ar[i]);
     }
     System.out.println("Even elements are");
     for(int element :al1) {
    	 System.out.println(element);
     }
     System.out.println("Total even are");
     System.out.println(al1.size());
     System.out.println("Odd elements are");
     for(int element1 :al2) {
    	 System.out.println(element1);
     }
     System.out.println("Total Odd are");
     System.out.println(al2.size());
     
	}
}
