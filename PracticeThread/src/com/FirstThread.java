package com;

public class FirstThread extends Thread {
	
	public void run() {
		while(true) {
		System.out.println("Hello World");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		
		
		
	}
	public static void main(String[] args) {
		FirstThread th=new FirstThread();
		
//		th1.start();
		SecondThread thr=new SecondThread();
		
		
		thr.start();
		th.start();
	}

}
