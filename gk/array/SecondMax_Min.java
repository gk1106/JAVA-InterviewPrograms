package com.pk.array;

public class SecondMax_Min {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 9, 8 };
		secondMax(arr);
		secondMin(arr);
	}

	private static void secondMin(int[] arr) {
		int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
			} else if (arr[i] < secMin && arr[i] != min) {
				secMin = arr[i];
			}
		}
		System.out.println("First Min  : " + min);
		System.out.println("Second Min : " + secMin);
	}

	static void secondMax(int[] arr) {
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println("First Max  : " + max);
		System.out.println("Second Max : " + secMax);
	}

}
