package com.program;

public class FactorialOfnumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact *= n;
			n--;
		}

		return fact;
	}

}
