package com.javaparctice.sound;

public class Scanner {

	public static void main(String[] args) {

		java.util.Scanner sr = new java.util.Scanner(System.in);
		System.out.println("enter the number:");
		int num = sr.nextInt();

		int a = num, j = 0, temp = 0, i = 0;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
			temp = j;
		}
		if (num == temp) {
			System.out.println(num + "is a amstrong");
		} else {
			System.out.println(num + "not a amstrong");
		}

	}
}
