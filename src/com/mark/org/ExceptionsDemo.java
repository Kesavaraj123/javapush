package com.mark.org;

public class ExceptionsDemo {

	public static void test() throws MyException   {

		int i = 10, j = 0;
		if (j == 0) {
			//System.out.println(i / j);
			throw new MyException();
		} else {
			System.out.println(i / j);
			System.out.println("completed");
		}
	}

	public static void main(String[] args) throws Exception, MyException {
		test();
	}
}
