package com.program;

import java.util.Iterator;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int n = 2;
		boolean b = isPrime(n);
		System.out.println(b);
	}

	private static boolean isPrime(int n) {
		if ( n == 0|| n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
