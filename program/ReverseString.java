package com.program;

public class ReverseString {

	public static void main(String[] args) {
		String s = "java";
		System.out.println(reverse(s));
	}

	private static String reverse(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
