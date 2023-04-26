package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
public static void main(String[] args) {
	String[] array= {"Sumit","Abhishek","Akash","Gaurav"};
	List<String> al= new ArrayList<>(Arrays.asList(array));
	al.add("Raman");
	
	
	
	al.add("Raj");
	System.out.println(al);
	

String[] arra= {"su"};
List al1=Arrays.asList(arra);
System.out.println(al1);
int [] array1= {1,2,3};

List<Integer> l=new ArrayList<Integer>();
for(int i:array1) {
	l.add(i);
	
}



	
	
}
}
