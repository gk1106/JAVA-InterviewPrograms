package com.pk.array;

public class FindMax_Min {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 7, 5, 0, 8, 3, 8, };
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max Element : " + max);

		System.out.println("Min Element : " + min);
	}

}
