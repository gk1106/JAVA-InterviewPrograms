package com.program;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToStringArray {

	public static void main(String[] args) {

		String str = "public static void main";
//		String[] w = { "public", "static", "void", "main" };
//		System.out.println("Main Array : " + Arrays.toString(w));
//
//		convertStringToStringArray(str);
//		convertPascalCase(str);
//		converPascalCaseUsingCharArray(str);
//		convertPascalCase2("pUBLIC sTATIC vOID mAIN");

		removeWhiteSpace(str);

	}

	static void removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	static void convertPascalCase2(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {
				sb.append((char) (ch - 32));
			} else if (Character.isUpperCase(ch)) {
				sb.append((char) (ch + 32));
			} else {
				sb.append(ch);
			}
		}
		str = sb.toString();
		System.out.println(str);

	}

	static void converPascalCaseUsingCharArray(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && Character.isLowerCase(ch[i])) {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] == ' ' && Character.isLowerCase(ch[i + 1])) {
				ch[i + 1] = (char) (ch[i + 1] - 32);
			}
		}
		str = String.valueOf(ch);
		System.out.println(str);
	}

	static void convertPascalCase(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 && Character.isLowerCase(ch)) {
				sb.append((char) (ch - 32));
			} else if (ch == ' ' && Character.isLowerCase(str.charAt(i + 1))) {
				sb.append(" " + (char) (str.charAt(i + 1) - 32));
				i++;
			} else {
				sb.append(ch);
			}
		}
		str = sb.toString();
		System.out.println(str);
	}

	static void convertStringToStringArray(String str) {
		String[] words = new String[findSize(str)];
		int index = 0;
		char[] ch = str.toCharArray();
		for (int i = 0, pos = 0; i < ch.length;) {
			int start = i, end = i;
			while (pos < ch.length && ch[pos] != ' ') {
				pos++;
			}
			end = pos - 1;
			StringBuilder sb = new StringBuilder();
			while (start <= end) {
				sb.append(ch[start++]);
			}
			pos++;
			i = pos;
			words[index++] = sb.toString();
		}
		System.out.println("Copy Array : " + Arrays.toString(words));
	}

	static int findSize(String str) {
		String[] array = str.split(" ");
		return array.length;
	}

}
