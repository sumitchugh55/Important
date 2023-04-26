package com;

import java.util.LinkedList;
import java.util.List;

public class MethodForeach {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>(); 
			l.add(50);
			l.forEach((n)->System.out.println(n));
			//we can also use
			l.forEach(System.out::print);
		
	}

}
