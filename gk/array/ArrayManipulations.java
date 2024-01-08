package com.practice.JavaPrograms.src.com.pk.array;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5 };
		addElement(a, 3, 4);
		int[] b = { 6, 7, 8, 9, 10 };
		deleteElement(b);
		mergeTwoArrays(addElement(a, 3, 4), b);
	}

	static void mergeTwoArrays(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0, k = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else if (k < b.length) {
				c[i] = b[k++];
			}
		}
		System.out.println(Arrays.toString(c));
	}

	private static void deleteElement(int[] b) {
		int[] a = new int[b.length - 1];
		for (int i = 0, k = 0; i < b.length; i++) {
			if (b[i] == 4) {
				continue;
			}
			a[k++] = b[i];
		}
		System.out.println(Arrays.toString(a));
	}

	private static int[] addElement(int[] a, int pos, int ele) {
		int[] b = new int[a.length + 1];
		for (int i = 0, k = 0; i < b.length; i++) {
			if (i == pos) {
				b[pos] = ele;
			} else {
				b[i] = a[k++];
			}
		}
//		System.out.println(Arrays.toString(b));
		return b;
	}
}