package com.program;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s = "Madam";

		System.out.println(palindrome(s) ? "yes" : "no");
	}

	private static boolean palindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString().equals(s);
	}

}
