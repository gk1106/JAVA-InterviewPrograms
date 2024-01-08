package com.program;

public class Anagram3 {

	public static void main(String[] args) {
		String s1 = "school master", s2 = "the classroom";

		isAnagram(s1, s2);
	}

	private static void isAnagram(String s1, String s2) {

		String copyOfS1 = s1.replaceAll("\\s", "").toLowerCase(), copyOfS2 = s2.replaceAll("\\s", "").toLowerCase();

		boolean res = true;

		if (copyOfS1.length() != copyOfS2.length()) {
			res = false;
		} else {

			char[] s1Array = copyOfS1.toCharArray();

			StringBuilder sb = new StringBuilder(copyOfS2);

			for (char c : s1Array) {
				int index = sb.indexOf("" + c);

				if (index != -1) {

					sb.deleteCharAt(index);
				} else {
					res = false;
					break;
				}
			}
		}
		if (res) {
			System.out.println(s1 + " & " + s2 + " are Anagram");
		} else {
			System.out.println(s1 + " & " + s2 + " are not Anagram");

		}

	}

}
