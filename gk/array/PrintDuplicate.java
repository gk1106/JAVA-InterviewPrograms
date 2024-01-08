package com.pk.array;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 1, 3, 2, 5 };
		boolean[] vis = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (vis[i] == true) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					vis[j] = true;
				}
			}

			if (count > 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
