package com.mark.org;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}
	public ConstructorDemo(int id) {
		System.out.println("Employee id is "+id);
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(12);
	}
}
