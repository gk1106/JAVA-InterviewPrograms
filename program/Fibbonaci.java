package com.program;

public class Fibbonaci {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 1;

		for (int i = 1; i <= 10; i++) {
//			System.out.print(a + " ");
			a = b;
			b = c;
			c = a + b;
		}

	}

}
