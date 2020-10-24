package com.mark.org;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add("keshav");
		li.add("unique");
		System.out.println(li);
		List<Object> li1 = new ArrayList<Object>();
		li1.add(10);
		li1.add(30);
		li1.add("sweaty");
		li1.add("keshav");
		System.out.println(li1);
		li.addAll(li1);
		System.out.println(li);
		li.retainAll(li1);
		System.out.println(li);
		Object ob = li.get(3);
		System.out.println(ob);
		boolean cs = li.contains("keshav");
		System.out.println(cs);
		li.set(1, "babe");
		System.out.println(li);
	}
}
