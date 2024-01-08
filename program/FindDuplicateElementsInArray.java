package com.program;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 1, 2, 5, 6, 7, 5, 3 };

		boolean[] visited = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (visited[i]) {
				continue;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 1) {
				System.out.println(a[i] + " : " + count);
			}

		}

	}

}
