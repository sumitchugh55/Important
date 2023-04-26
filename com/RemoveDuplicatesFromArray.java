package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,1,3,4,6};
		TreeSet<Integer> l=new TreeSet<>();
		for(int i=0;i<numbers.length;i++) {
			l.add(numbers[i]);
		
		}
		System.out.println(l);
	}

}
