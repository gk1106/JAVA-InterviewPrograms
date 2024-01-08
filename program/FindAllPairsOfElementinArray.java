package com.program;

public class FindAllPairsOfElementinArray {

	public static void main(String[] args) {

//		pairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
	}

		static void pairs(int[] a, int num) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == num) {
					System.out.println(a[i] + " + " + a[j] + " = " + num);
				}
			}

		}

	}

}
