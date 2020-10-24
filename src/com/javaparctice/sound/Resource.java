package com.javaparctice.sound;

public  class Resource implements InterfaceClass {
	@Override
	public void hide_Id() {
		System.out.println("hide id");

	}

	@Override
	public void hide_Stud_Name() {
		System.out.println("hide stud name");
	}

	@Override
	public void report_stud() {
		System.out.println("repertstud");
	}

	public static void numberStstuc() {
		System.out.println("gfdfj");
	}

	public static void main(String[] args) {

		InterfaceClass r = new Resource();
		r.hide_Id();
		r.hide_Stud_Name();
		r.report_stud();

		numberStstuc();
		

	}
}
