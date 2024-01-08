package com.pk.array;

public class ThirdMax_Min {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 7, 2, 1, 1, 9, 8 };
		thirdMax(arr);
		thirdMin(arr);
	}

	private static void thirdMin(int[] arr) {
		int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE, thirdMin = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < min) {
				thirdMin = secMin;
				secMin = min;
				min = num;
			} else if (num < secMin && num != min) {
				thirdMin = secMin;
				secMin = num;
			} else if (num < thirdMin && num != secMin && num != min) {
				thirdMin = num;
			}
		}
		System.out.println("First Max  : " + min);
		System.out.println("Second Max : " + secMin);
		System.out.println("Third Max  : " + thirdMin);
	}

	static void thirdMax(int[] arr) {
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				thirdMax = secMax;
				secMax = max;
				max = num;
			} else if (num > secMax && num != max) {
				thirdMax = secMax;
				secMax = num;
			} else if (num > thirdMax && num != secMax && num != max) {
				thirdMax = num;
			}
		}
		System.out.println("First Max  : " + max);
		System.out.println("Second Max : " + secMax);
		System.out.println("Third Max  : " + thirdMax);
	}
}
