package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simple=new SimpleDateFormat(pattern);
		String date=simple.format(new Date());
		System.out.println(date);
	}

}
