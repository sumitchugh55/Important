package com;

import java.util.Arrays;

public class SortCharacter {
	public static void main(String[] args) {
		String str="sumit";
		char [] arr=str.toCharArray();
		Arrays.sort(arr);
		System.out.println(str.valueOf(arr));
	}

}
