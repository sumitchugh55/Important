package com;


interface apple{
	//abstract method
	void say();
}
public class InterfaceFunctional implements apple {
	public void say() {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		InterfaceFunctional f=new InterfaceFunctional();
		f.say();
		
		
	}

}
