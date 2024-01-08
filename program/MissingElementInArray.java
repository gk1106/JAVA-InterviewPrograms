package com.program;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] s1 = { -9, 1000 };

		for (int i = 0; i < s1.length - 1; i++) {
			for (int j = s1[i] + 1; j < s1[i + 1]; j++) {
				System.out.println(j);
			}
		}
	}

}
 