package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(50);
		l.add(70);
		l.add(90);
		l.add(20);
		
		Collections.reverse(l);
		System.out.println(l);
	
	}
}

