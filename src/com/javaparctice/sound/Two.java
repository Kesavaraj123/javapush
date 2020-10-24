package com.javaparctice.sound;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class Two {

	public static void main(String[] args) {
		String s = "australia is the australia good of is the good ";
		String[] split = s.split(" ");
		for (String spt : split) {
			System.out.println(" " + spt);
}

		HashSet<String> hr = new HashSet<String>();
		HashSet<String> hr1 = new HashSet<String>();

		for (String str1 : split) {

			if (hr.contains(str1)) {
				hr1.add(str1);

			} else {
				hr.add(str1);

			}

		}
		System.out.println(hr1);
		System.out.println(hr);
		hr1.retainAll(hr);
		System.out.println(hr1);
LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<String, Integer>();
for (String spm : split) {
	lhm.put(spm, 1);
			
			  if (lhm.containsKey(spm)) { lhm1.put(spm, lhm1.get(spm)+1);
			  
			  } else { lhm.put(spm, 1);
			  
			  }
			 
			
	
}System.out.println(lhm);
	}

}
