package com.mark.org;

public class OverLoadDemo {
	public void stud(int Id) {
		System.out.println("Student Id is "+Id);
	}

	public void stud(String Name, String Result) {
		System.out.println("Student Name & Result  is " + Name + "," + Result);
	}

	public void stud(char Grade, int Total) {
		System.out.println(" Grade And Total is " + Grade + "," + Total);
	}

	public void stud(double Average, String Grett) {
		System.out.println(" Average  " + Average);
		System.out.println(" Grett " + Grett);

	}

	public static void main(String[] args) {
		OverLoadDemo od = new OverLoadDemo();
		od.stud(7);
		od.stud("Keshav", "Pass");
		od.stud('O', 1199);
		od.stud(99.9, "Congrates");

	}

}
