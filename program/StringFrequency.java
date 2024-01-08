package com.program;

public class StringFrequency {

	public static void main(String[] args) {
		String str = "java a";

		boolean[] visited = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (visited[i] == false) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						visited[j] = true;
						count++;
					}
				}
			}

			if (count >= 1 && str.charAt(i) != ' ') {
				System.out.println(str.charAt(i) + " is repeated " + count + " times.");
			}

		}

	}

}
