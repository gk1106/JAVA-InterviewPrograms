package com.program;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {

		String s1 = "school master", s2 = "the classroom";

		isAnagram(s1, s2);
	}

	public static void isAnagram(String s1, String s2) {
		String copyOfS1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfS2 = s2.replaceAll("\\s", "").toLowerCase();

		boolean res = true;

		if (copyOfS1.length() != copyOfS2.length()) {
			res = false;
		} else {
			char[] s1array = copyOfS1.toCharArray();
			char[] s2array = copyOfS2.toCharArray();
			Arrays.sort(s1array);
			Arrays.sort(s2array);
			res = Arrays.equals(s1array, s2array);
		}

		if (res) {
			System.out.println(s1 + " & " + s2 + " are Anagram");
		} else {
			System.out.println(s1 + " & " + s2 + " are not Anagram");
		}
	}

}
