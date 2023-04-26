package com;

import java.util.ArrayList;
import java.util.List;

public class MergeTwolist {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(50);
		l.add(70);
		System.out.println("before merging result"+l);
		List<Integer> l1=new ArrayList<>();
		l1.add(80);
		l1.add(100);
		//addAll is used to merge two list
		l.addAll(l1);
		System.out.println("After merging result"+l);
	}
	
	

}
