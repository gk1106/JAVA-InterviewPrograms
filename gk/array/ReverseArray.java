package com.pk.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0,j=a.length-1; i < j; i++,j--) {
			int temp = a[i];
			a[i] =a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
