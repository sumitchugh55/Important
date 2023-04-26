package array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromTwoArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,7};
		int[] b= {1,2,4,5,6,7,8,8};
		
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
					break;
					}
				}
			}
		for(int element:hs) {
			System.out.println(element);
		}
		}
	}


