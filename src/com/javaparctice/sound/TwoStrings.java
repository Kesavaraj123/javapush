package com.javaparctice.sound;

import java.awt.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TwoStrings {
	public static void main(String[] args) {
		String s = "autralia";
		String s1 = "srilanka";

		HashSet<Character> hs = new HashSet<Character>();
		HashSet<Character> hs1 = new HashSet<Character>();

		for (Character shs : s.toCharArray()) {
			hs.add(shs);

		}
		//System.out.println(hs);

		for (Character shs1 : s1.toCharArray()) {
			hs1.add(shs1);

		}
		//System.out.println(hs1);
		hs.retainAll(hs1);
		System.out.println(" " + hs);
		for (Character ret : hs) {
			System.out.println(" " + ret);

		}
		System.out.println("\n total number of common letter :" + hs.size());

	}
}
