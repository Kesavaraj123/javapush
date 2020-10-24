package com.mark.org;

public class SoundChild extends KeshavParent {
	/*
	 * @Override public void addConcept(int a, String s, int b, float mark) {
	 * super.addConcept(a, s, b, mark); }
	 */
	/*
	 * @Override public void addConcept(int a, String s, int b, float mark) {
	 * super.addConcept(15, "override", 15,55.5f); }
	 */

	static int a = 10, b = 2, c;

	public static void divisionCocept() {
		c = a / b;
		System.out.println("divison:" + c);

	}

	public static void main(String[] args) {

		KeshavParent kp = new SoundChild();
		/*
		 * kp.addConcept(a, "jgjh", b, 55.5f); divisionCocept();
		 */
	}

}
