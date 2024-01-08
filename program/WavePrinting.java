package com.program;

import java.util.Scanner;

public class WavePrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int n = sc.nextInt();

		int[][] a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter a value to " + i + "," + j + " :: ");
				a[i][j] = sc.nextInt();
			}
		}

		for (int j = 0; j < a[0].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i][j] + " ");
				}
			} else {

				for (int i = a.length - 1; i >= 0; i--) {
					System.out.print(a[i][j] + " ");
				}

			}
			System.out.println();
		}

	}

}
