package com.program;

public class AnagramOrNot {

	public static void main(String[] args) {
		String s1 = "school Master", s2 = "the classroom";

		if (bubbleSort(s2).equals(bubbleSort(s1)) && s1.length() == s2.length()) {
			System.out.println(s1 + " & " + s2 + " are Anagram");
		} else {
			System.out.println("Not a Anagram ");
		}
	}

	public static String bubbleSort(String s1) {
		char[] ch = s1.replaceAll(" ", "").toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		return String.valueOf(ch);
	}

}
