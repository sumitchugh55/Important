package com;
//object class is the super class for all classes in java
public class NullPointerException extends Object {

	public static void main(String[] args) {
		Object ref=null;
		ref.toString();
		System.out.println(ref.toString());
	}
}
