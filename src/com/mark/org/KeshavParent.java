package com.mark.org;

public class KeshavParent {

	int c;

	public void addConcept(int a, String s, int b, float mark) {
		c = a + b;
		System.out.println("sum of the number is:" + c);
		System.out.println("name of concpet:" + s);
		System.out.println("mark of sub:" + mark);

	}

	
	public void SubConcept(int a, String s1, int b, float mar) {
		c = a - b;
		System.out.println("subraction of numbr:" + c);
		System.out.println("name of concpet:" + s1);
		System.out.println("mark of sub:" + mar);

	}

	public void multipleConcept(int a, String s2, int b, float ma) {
		c = a * b;
		System.out.println("multiple of num :" + c);
		System.out.println("name of concpet:" + s2);
		System.out.println("mark of sub:" + ma);

	}

	public void trueFalseCOncept(int a, String s3, int b, float m) {
		System.out.println(a + "," + b);
		System.out.println("name of concpet:" + s3);
		System.out.println("mark of sub:" + m);

	}

	public static void main(String[] args) {

		KeshavParent kp = new SoundChild();
		kp.addConcept(10, "add", 5, 80.5f);
		kp.SubConcept(15, "sub", 10, 70.5f);
		kp.multipleConcept(25, "multi", 25, 85.5f);
		kp.trueFalseCOncept(50, "true", 50, 9.5f);
		

		// SoundChild sc=new KeshavParent();

		/*
		 * kp.addConcept(); kp.SubConcept(); kp.multipleConcept();
		 * kp.trueFalseCOncept();
		 */
		/*
		 * addConcept(); SubConcept(); multipleConcept(); trueFalseCOncept();
		 */

	}

}
