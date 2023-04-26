package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
	      int[] arr = {5, 2, 3, 4, 2};

	        List<Integer> arrayList = new ArrayList<Integer>();
	        for (int i : arr) {
	            arrayList.add(i);
	        }

	        // Insert element at index 2
	        arrayList.add(10);
	        System.out.println(arrayList);

	}
}