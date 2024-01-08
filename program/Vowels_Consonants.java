package com.program;


public class Vowels_Consonants {

	public static void main(String[] args) {
		String s = "ae#zyu*i";

		int vowels = 0, consonant = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isVowel(ch)) {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z') && isVowel(ch) == false) {
				consonant++;
			}
		}
		System.out.println("No of Vowels : " + vowels);
		System.out.println("No of Consonant : " + consonant);
		System.out.println("Other char : " + (int) (s.length() - (vowels + consonant)));

	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
			return true;
		}
		return false;
	}

}
