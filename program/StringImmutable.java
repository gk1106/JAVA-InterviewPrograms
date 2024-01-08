package com.program;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = s1;

		System.out.println(s1 == s2);

		s2 += "scope";

		System.out.println(s1 == s2);
	}

}
