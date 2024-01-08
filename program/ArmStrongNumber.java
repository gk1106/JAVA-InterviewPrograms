package com.program;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt(), sum = 0, count = 0, temp1 = num, temp2 = num;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		while (temp1 > 0) {
			int last = temp1 % 10;
			int x = last, n = count, fact = 1;
			while (n > 0) {
				fact = fact * x;
				n--;
			}
			sum = sum + fact;
			temp1 = temp1 / 10;
		}
		if (sum == temp2) {
			System.out.println("Yes! ArmStrong number");
		} else {
			System.err.println("No! ArmStrong number");
		}
	}

}
