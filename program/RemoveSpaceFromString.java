package com.program;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String s = "public static void main";
		System.out.println(removeSpace(s));
	}

	static String removeSpace(String s) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

}
