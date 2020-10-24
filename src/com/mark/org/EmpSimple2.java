package com.mark.org;

public class EmpSimple2 {
	public void empId() {
		System.out.println("Emp id is 12");
	}

	public void empName() {
		System.out.println("Emp name is Raj");
	}

	public static void main(String[] args) {
		// create obj
		// classname objname = new classname
		EmpSimple2 ed = new EmpSimple2();
		ed.empId();
		ed.empName();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

	}
}
