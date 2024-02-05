package com.nt.lab;

public class StackOverFlowErrorDemo {
	static void display()
	{
		System.out.print("I am SrackOverFlow");
		display();
	}
	
	public static void main(String[] args) {
		StackOverFlowErrorDemo.display();
	}
	

}
