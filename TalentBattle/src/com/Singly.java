package com;

import java.util.Arrays;
import java.util.Scanner;

public class Singly {
	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);

        int []arr=new int[6];
        System.out.println("enter the array elements");
        int n=0;
        while(n<6){
            arr[n]=scan.nextInt();
            n++;}
        
      int size=arr.length-1;
         while(size>=0){
             System.out.println(arr[size]);
             size--;
         }
        
//      for(int i=0;i<arr.length;i++) {
//    	  System.out.println(arr[i]);
//      }
        
          
    }
	
  

	}


