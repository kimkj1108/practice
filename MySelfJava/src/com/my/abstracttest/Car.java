package com.my.abstracttest;

public abstract class Car {
	void topSpeed(int feed) {
		System.out.println("차량의 최고속은"+feed+"입니다.");
	}
	
	abstract void name();

}
