package com.javaparctice.sound;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.mark.org.CollectionsMethods;

public class MapMethodPractice  extends CollectionsMethods{

	public static void mapMeth() {

		Map<String, String> lm = new LinkedHashMap<String, String>();
		
		lm.put("keshav", "pass");
		lm.put("nayanthara", "ok");
		lm.put("hanshika", "wow");
		lm.put("tamana", "hot");
		lm.put("keshav", "handsome");
		lm.put("keerthi ", "intermedite");
		lm.put("anushka", "hot");
		System.out.println(lm.get("keshav"));
		
		System.out.println("for each by entry set:");
		
		for (Entry<String, String> for1 : lm.entrySet()) {
			System.out.println(for1);

		}
		
		System.out.println("get value by passing key using get():");
		
		String sget = lm.get("keshav");
		
		String sgetta = lm.get("tamana");
		//keyset()
		System.out.println("get all key by using keyset():");
		
		System.out.println(lm.keySet());
		
		System.out.println("print all key ony by one using for each:");
		

		for (String lm1 : lm.keySet()) {
			System.out.println(lm1);

		}
		System.out.println("value()");
		 
		Collection<String> v = lm.values();
		System.out.println(v);
		
		for (String vs : v) {
			System.out.println(vs);
			
		}
		System.out.println("==================================================================");

	}

	public static void main(String[] args) {
		mapMeth();
		setConcept();
		//listConcept();
		
	}

}
