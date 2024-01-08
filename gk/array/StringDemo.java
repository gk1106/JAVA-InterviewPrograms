package com.pk.array;

final class A {
	public static void add() {
		System.out.println("From Class A");
	}
}

public class StringDemo {

	public static void main(String[] args) {
		String s = new String("prem");
		String p = s;
		System.out.println(p == s + "/" + s.equals(p));
		A.add();
	}

}
