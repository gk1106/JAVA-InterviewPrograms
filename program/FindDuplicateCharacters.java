package com.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str = "public static void main";

//		duplicateCharacters(str);
		duplicateCharactersWithOwnLogic(str);

	}

	public static void duplicateCharactersWithOwnLogic(String str) {
		boolean[] visited = new boolean[str.length()];
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (visited[i] || str.charAt(i) == ' ') {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 1) {
				System.out.println(str.charAt(i) + " : " + count);
			}
		}
	}

	public static void duplicateCharacters(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch) && ch != ' ') {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> keySet = map.keySet();
		for (char ch : keySet) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));
			}
		}
	}
}
