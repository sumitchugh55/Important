package com;

public class IllustrateTryCatch {
	public static void main(String[] args) {
		
		try {
			int[] numbers= {1,2,3,4,5,6,7,};
			System.out.println(numbers[10]);
			System.out.println("Code is right");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		finally {
		System.out.println("Try catch is finished");}
		
	}

}
