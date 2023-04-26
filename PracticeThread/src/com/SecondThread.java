package com;

public class SecondThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("hello Sumit");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	
	}
	
		
	

}
