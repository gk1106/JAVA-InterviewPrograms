package com.practice.JavaPrograms.src.com.pk.array;

public class BasicArrayPrograms {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		sumOfArray(arr);
		productOfArray(arr);
		sumOfEvenNumber(arr);
		prodOfEvenNumber(arr);
		sumOfOddNumber(arr);
		prodOfOddNumber(arr);
		findEvenIndexElement(arr);
		findOddIndexElement(arr);

	}

	private static void findOddIndexElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	private static void findEvenIndexElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	private static void sumOfOddNumber(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}

		}
		System.out.println("Sum Of Odd Number : " + sum);
	}

	private static void prodOfOddNumber(int[] arr) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				prod *= arr[i];
			}
		}
		System.out.println("Prod Of odd Number : " + prod);
	}

	private static void prodOfEvenNumber(int[] arr) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				prod *= arr[i];
			}
		}
		System.out.println("Product of Even Number : " + prod);
	}

	private static void sumOfEvenNumber(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of Even Number : " + sum);
	}

	static void productOfArray(int[] arr) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}
		System.out.println("Product Of Array Element :: " + prod);
	}

	static void sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum Of Array Element :: " + sum);
	}
}