package com.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurrencesOfEachCharacterInString {

	public static void main(String[] args) {
		String s = "Jajvaej2ee";

//		usingOwnLogic(s);
//		usingMap(s);
		getMostRepeatedCharacter(s);
	}

	private static void getMostRepeatedCharacter(String s) {

		int max = Integer.MIN_VALUE;
		char c = ' ';
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > max) {
				max = e.getValue();
				c = e.getKey();
			}
		}

		System.out.println(c + " is most repeated character for " + max + " times.");
	}

	private static void usingMap(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getKey() != ' ') {
				System.out.println(e.getKey() + " is repeated " + e.getValue() + " times.");
			}
		}
	}

	private static void usingOwnLogic(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (visited[i]) {
				continue;
			}

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count >= 1 && ch[i] != ' ') {
				System.out.println(ch[i] + " is repeated " + count + " times.");
			}
		}

	}

}
