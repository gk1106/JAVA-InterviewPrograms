package com.program;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str = "public static void main";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
	}

}
