package com.program;

import java.util.Scanner;

public class CountTheNumberOccurenceinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value to n : ");
		int n = sc.nextInt();
		System.out.print("Enter a Value to d : ");
		int d = sc.nextInt();

		int x = countDigitFreq(n, d);

		System.out.println(x);

		sc.close();
	}

	static int countDigitFreq(int n, int d) {
		if (n == 0 && d == 0) {
			return 1;
		}
		if (n < 0) {
			n =  -1 * n;
		}

		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit == d) {
				count++;
			}
			n = n / 10;
		}

		return count;
	}

}
