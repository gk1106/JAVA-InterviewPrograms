package com.program;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 8, 11, 22, 13, 9, 0 };
		Arrays.sort(a);
		System.out.println(binary(a, a.length, 0, 9));
		System.out.println(new StringBuffer().append("ja").append("va").append("l"));
	}

	public static int binary(int[] a, int high, int low, int key) {
		int mid = (low + high) / 2;
	
		while (low <= high) {
			if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		
		if (low > high) {
			return -1;
		}
		return -1;

	}

}
