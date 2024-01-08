package com.program;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] a = { 3, 9, -1, 3, -2, 7 }; 
//		System.out.println(Arrays.toString(bubbleSort(a)));
		System.out.println(Arrays.toString(insertionSort(a)));
	}

	private static int[] insertionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = a[i], pos = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					pos = j;
				}
			}
			int temp = a[i];
			a[i] = a[pos];
			a[pos] = temp;
		}

		return a;
	}

	private static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

}
