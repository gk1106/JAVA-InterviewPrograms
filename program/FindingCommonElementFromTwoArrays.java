package com.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindingCommonElementFromTwoArrays {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "c", "d" };
		String[] s2 = { "b", "s", "a", "v" };

		Set<String> s = new LinkedHashSet<String>();

		for (int i = 0; i < s1.length; i++) {

			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					s.add(s1[i]);
				}
			}
		}
		System.out.println(s);

	}

}
