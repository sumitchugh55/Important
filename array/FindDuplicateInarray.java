package array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInarray {
	public static void main(String[] args) {
		int[] a1 = { 1, 2,4,3,6, 4, 5, 6 };
 System.out.println("duplicate elements are");
		Set<Integer> s = new HashSet<>();
		for (int no : a1) {
			if (s.add(no) == false) {
				System.out.println(no+"");
			}
		}
	}

}
