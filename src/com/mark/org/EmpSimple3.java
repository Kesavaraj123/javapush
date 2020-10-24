package com.mark.org;

public class EmpSimple3 {
	public void emp(int id) {
		System.out.println("Enter the  Emp Id" + id);
	}

	public void emp(String name) {
		System.out.println("Enter the emp name" + name);
	}

	public void emp(double salary, String name) {
		System.out.println("Emp salary & name is " + salary + " " + name);
	}

	public static void main(String[] args) {
		EmpSimple3 em = new EmpSimple3();
		em.emp(12);
		em.emp("Keshav");
		em.emp(25.50, "Keshav");

	}
}
