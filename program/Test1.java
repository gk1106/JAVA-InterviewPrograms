package com.program;

class Animal {

	public void eat() {
		System.out.println("I can eat");
	}

}
class Cat extends Animal{
	

}

public class Test1 {

	public static void main(String[] args) {
       Animal a = new Animal();
       Cat c  = new Cat();
       c.eat();
       
	}

} 
