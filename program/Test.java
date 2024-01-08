package com.program;

class Programmer {

	private String name;
	private int age;

	Programmer(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void returnProgrammerDetails() {
		System.out.println("Programmer Name : " + name);
		System.out.println("Programmer Age  : " + age);
	}

}

public class Test {

	public static void main(String[] args) {
		Programmer p = new Programmer("prem", 23);
		System.out.println(p.getName());
		System.out.println(p.getAge());

		p.setName("abc");
		p.setAge(20);

		p.returnProgrammerDetails();

	}

}
