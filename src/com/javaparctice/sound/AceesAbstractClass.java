package com.javaparctice.sound;

public class AceesAbstractClass extends AbstractDemo {

	@Override
	public void studName(String string, String string2) {
		System.out.println("stud name is:"+name);
		System.out.println("stud name is:"+string);
		System.out.println("stud name is:"+string2);
		
	}

	@Override
	public void stud_Report() {
		System.out.println("print abstract class");
		
	}
	
	public static void main(String[] args) {
		AbstractDemo aac = new AceesAbstractClass();
		aac.idStud(12, 9);
		aac.studName("sound", "nayan");
		aac.stud_Report();
		
	}

}
