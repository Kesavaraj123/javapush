package com.javaparctice.sound;

public class Brindz_Concept {
	static int a=150,b=50;
	static String s="brindha class today";
	char ch='k';
	
	public void add_Brind() {
		//int a=55,b=65;
		int c=a+b;
		System.out.println("given numberr added:"+c+' '+s+' '+ch);
		

	}
	public static void sub_Brind() {
		
		
		int c=a-b;
		System.out.println("given number sub:"+c);

	}
	public static void multi_Brind() {
		int c=a*b;
		System.out.println("gven number multi:"+c);
		
	}
	private static  void divid_Brind() {
		float c=a/b;
		System.out.println("given number div:"+c);

	}
	public static void main(String[] args) {
		
		  Brindz_Concept bc = new Brindz_Concept();
		  bc.add_Brind(); 
		  //bc.sub_Brind();
		  //bc.multi_Brind(); bc.divid_Brind();
		 
		bc. add_Brind();
		sub_Brind();
		multi_Brind();
		divid_Brind();
		
	}
	

}
