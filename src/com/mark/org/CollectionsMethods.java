package com.mark.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMethods {

	private  void listConcept() {
		ArrayList<Object> al = new ArrayList<Object>();

		al.add(10);
		al.add("hari");
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(2345);

		System.out.println("list added:" + al);
		 int sixe_before_add = al.size();

		System.out.println(sixe_before_add);

		int indexOf3 = al.indexOf(30);
		System.out.println(indexOf3);

		System.out.println("afer add meth index based"); // add method
		al.add(3, "keshav");
		System.out.println(al);

		System.out.println("checking index value changed:");
		int indexOf = al.indexOf("keshav");
		int indexOf2 = al.indexOf(30);
		System.out.println(indexOf);
		System.out.println(indexOf2);
		int sixeof_al = al.size();
		System.out.println(sixeof_al);

		// get
		Object ob1 = al.get(5);
		System.out.println(ob1);
		System.out.println("simple for loop:"); // for each or for becuase list indexbased

		for (int i = 0; i < al.size(); i++) {
			Object ob2 = al.get(i);
			System.out.println(ob2);

		}
		System.out.println("for each using:"); // for each
		for (Object ob3 : al) {

			System.out.println(ob3);

		}
		System.out.println("remove "); // remove
		Object remove = al.remove(3);
		System.out.println(al);
		System.out.println(remove);
		LinkedList<Object> LL = new LinkedList<Object>();
		LL.add(100);
		LL.add(1000);
		System.out.println(LL); //
		LL.addAll(al);

		System.out.println(LL); // retain all LL.retainAll(al);
		System.out.println(LL);
		al.retainAll(LL);
		System.out.println(al); // set
		LL.set(4, "keshavbilla");
		System.out.println(LL);
		al.set(5, "hari");
		System.out.println(al);
System.out.println("nextttttttttttttttttttt setttttttttttttttttt conceptttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
	}

	public static void setConcept() {

		ArrayList<Object> al = new ArrayList<Object>();
		Set<Object> ts = new TreeSet<Object>();
		al.add("keshav");
		al.add("hari");
		al.add("keshav");
		al.add("nayan");
		al.add("hanshi");

		al.add("nayan");
		al.add("khj");

		System.out.println(al);
		ts.addAll(al);

		System.out.println(ts);

		int j = ts.size();
		// System.out.println(i);
		System.out.println(j);
		System.out.println("========================================================================");

	}
	/*
	 * public static void main(String[] args) { listConcept(); setConcept();
	 * 
	 * }
	 */

}
