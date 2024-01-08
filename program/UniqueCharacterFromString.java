package com.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacterFromString {

	public static void main(String[] args) {
		String s = "abcb";
//		char[] ch = s.toCharArray();
//		boolean[] visited = new boolean[ch.length];
//
//		for (int i = 0; i < ch.length; i++) {
//			int count = 1;
//			if (visited[i] == true) {
//				continue;
//			}
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					count++;
//					visited[j] = true;
//				}
//			}
//			if (count == 1) {
//				System.out.println(ch[i]);
//			}
//		}
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (unique.contains(ch)) {
				unique.remove(ch);
			} else {
				unique.add(ch);
			}
		}
		for (char c : unique) {
			System.out.print(c + " ");
		}
	}

}
