package com.program;

public class ReverseEachWords {

	public static void main(String[] args) {
		String s = "public static void main";
//		particularWordReverse(s);
		reverseWordByWord(s);
	}

	private static void reverseWordByWord(String s) {
		String[] words = s.split(" ");
 
		StringBuilder sb = new StringBuilder();
		for (String str : words) {

			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
			sb.append(" ");

		}
		System.out.println(sb);

	}

	private static void particularWordReverse(String s) {
		String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = str[1].length() - 1; i >= 0; i--) {
			sb.append(str[1].charAt(i));
		}
		str[1] = sb.toString();
		sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i] + " ");
		}
		s = sb.toString();
		System.out.println(s);
	}

}
