package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] a= {3,9,1,10,4,20,2};
		Set<Integer> hs=new HashSet<>();
		for(int element:a) {
			hs.add(element);
		}
		 int longest_length=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int no=a[i];
				while(hs.contains(no)) {
					no++;
				}
				if(longest_length<no-a[i]) { 
					longest_length=no-a[i]; 
				}
			}
				
			
			
		}
		System.out.println(longest_length);	
		
		
	}

}
