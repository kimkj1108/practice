package com.inter.test01;

public class Dog implements Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍스멍스");

	}

	@Override
	public void eat(String feed) {
		// TODO Auto-generated method stub
		System.out.println("개가" + feed + "먹는다.");

	}

}
