package com;

import java.util.LinkedList;
import java.util.List;

public class OddNumberInList {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(8);
		for(int element:l) {
			if(element%2==0) {
				
			}
			else
			System.out.println(element);
		}
	}

}
