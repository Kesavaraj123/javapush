package com.mark.org;

public class BikeFinal {

	final int speedlimit;

	BikeFinal() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	
	  public static void newtonSkl(int n) { int i;
	  
	  for (i = 1; i <= n; i++) { if (i % 2 == 0) { System.out.print("even" + " " +
	  i + " ");
	  
	  } else { System.out.print("odd" + " " + i + " ");
	  
	  }
	  
	  }
	  
	  }
	 

	public static void main(String[] args) {
		new BikeFinal();
		newtonSkl(5);

	}

}
