package com.pk.array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 1, 3, 2, 5 };
		removeDuplicate(arr);
	}

	static void removeDuplicate(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						int pos = j;
						while (pos < arr.length - 1) {
							arr[pos] = arr[pos + 1];
							pos++;
						}
						j--;
						arr[arr.length - 1] = 0;
					}
				}
			}
		}
		int[] a = new int[count];
		for (int i = 0; i < a.length; i++) {
             a[i]  = arr[i];
		}
		System.out.println(Arrays.toString(a));
	}

}
