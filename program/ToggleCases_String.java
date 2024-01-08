package com.program;

public class ToggleCases_String {

	public static void main(String[] args) {
		String s = "Ab*#@Cd";

		s = convert(s);
		System.out.println(s);
	}

	public static String convert(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				sb.append((char) (ch + 32));
			} else if (ch >= 'a' && ch <= 'z') {
				sb.append((char) (ch - 32));
			} else {
				sb.append(ch);
			}

		}

		return sb.toString();
	}

}
