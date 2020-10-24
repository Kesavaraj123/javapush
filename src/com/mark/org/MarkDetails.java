package com.mark.org;

public class MarkDetails extends Mark {
	@Override
	public void mathsMark() {
		System.out.println(" Mark of Maths 35 ");
	}

	public static void main(String[] args) {
		MarkDetails md = new MarkDetails();
		md.englishMark();
		md.tamilMark();
		md.mathsMark();
	}
}
