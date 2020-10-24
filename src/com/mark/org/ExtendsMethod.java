package com.mark.org;

import com.javaparctice.sound.Brindz_Concept;

public class ExtendsMethod extends Brindz_Concept {
	@Override
	public void add_Brind() {
		// TODO Auto-generated method stub
		super.add_Brind();
	}
	
	/*
	 * @Override public void emp(int id) { super.emp(id); }
	 * 
	 * @Override public void emp(String name) {
	 * 
	 * super.emp(name); }
	 */
	public static void main(String[] args) {
		ExtendsMethod sl = new ExtendsMethod();
		sl.add_Brind();
		sub_Brind();
		multi_Brind();
		//divid_Brind();
		
	}

	
	
}
