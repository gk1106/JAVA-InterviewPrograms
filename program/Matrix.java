package com.program;

import java.util.Scanner;

public class Matrix {

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

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//
//			}
//			System.out.println();
//		}

		for (int i = 0; i < n; i++) {
			System.out.print("Row " + i + " : ");
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int j = 0; j < n; j++) {
			System.out.print("Col " + j + " : ");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
