package com;
import java.util.*;
import 

public class ArrayMin {
	static int min(int array) {
		
		int min = INT_MAX;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}

		}
		return;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		
	}

}
