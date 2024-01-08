package com.program;

public class CheckIfVowelPresentInaStringorNot {

	public static void main(String[] args) {
		String s = "public static void main";
		boolean b = checkVowel(s);
		System.out.println(b);
	}

	private static boolean checkVowel(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
				return true;
			}
		}

		return false;
	}

}
