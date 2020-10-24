package com.mark.org;

//Immutable
public class MutableDemo {
	public static void main(String[] args) {
		StringBuffer s1 =new StringBuffer("Greens");
		StringBuffer s2 = new StringBuffer("Greens");
		StringBuffer s3 = new StringBuffer("Technology");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
	s1.append(s3);
		System.out.println(System.identityHashCode(s1));
		
		
		
	}
}
