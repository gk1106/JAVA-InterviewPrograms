package com.program;

import java.util.Scanner;

public class First_LastOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a n value : ");
		int n = sc.nextInt(), target, fist = -1, last = -1;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("Enter a target value : ");
		target = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			if (a[i] == target) {
				if (!flag) {
					fist = i;
					last = i;
					flag = true;
				} else {
					last = i;
				}
			}
		}
		if (flag) {
			System.out.println("First index : " + fist);
			System.out.println("Last index : " + last);
		} else {
			System.out.println("Element doesn't exits in an array");
		}

		sc.close();
	}

}
