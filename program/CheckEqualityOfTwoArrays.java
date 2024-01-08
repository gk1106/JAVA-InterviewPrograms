package com.program;


public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 0, 3};
		int[] b = { 1, 2, 3, 4 };

		boolean res = true;

		if (a.length != b.length) {
			res = false;
		} else {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					res = false;break;
				}
			}
		}

		if (res) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both are not equal");
		}

	}

}
