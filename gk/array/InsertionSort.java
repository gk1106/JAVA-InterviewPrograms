package com.pk.array;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 7, 2, 1, 1, 9, 8 };
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i], pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}