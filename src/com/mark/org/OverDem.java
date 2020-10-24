package com.mark.org;

public class OverDem extends OverLoadDemo {
	@Override
	public void stud(int Id) {
		super.stud(Id);
		
	}

	@Override
	public void stud(String Name, String Result) {
		super.stud(Name, Result);
		
	}

	public void grett(String Grett) {
		System.out.println("Grett:: " + Grett);

	}

	public static void main(String[] args) {

		OverDem od = new OverDem();
		od.stud(3);
		od.stud("Dhanu", "Pass");
		od.grett("Congratulation ");
	}

		
	}

