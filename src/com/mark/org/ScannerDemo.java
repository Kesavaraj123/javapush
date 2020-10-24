package com.mark.org;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the Name, Age,Salary");

		String Name = in.nextLine();
		int Age = in.nextInt();
		double Salary = in.nextDouble();
		System.out.println(" Emp name is "+Name );
		System.out.println(" Emp Age is "+Age);
		System.out.println(" Emp Salary is "+Salary);
	}
}
