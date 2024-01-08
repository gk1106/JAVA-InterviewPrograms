package com.program;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int x = fact(n);
		System.out.println(x);
		sc.close();

	}

	private static int fact(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);
	}

}
