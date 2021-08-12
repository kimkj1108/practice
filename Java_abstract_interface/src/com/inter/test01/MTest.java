package com.inter.test01;

public class MTest {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.bark();
		cat.eat("고양이사료");
		
		Animal dog = new Dog();
		dog.bark();
		dog.eat("개사료");
 	}

}
