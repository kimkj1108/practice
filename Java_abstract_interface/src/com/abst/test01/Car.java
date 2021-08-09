package com.abst.test01;

public abstract class Car {
	//String name;
	public void function(String brand_name) {
		//this.name = brand_name;
		System.out.println(brand_name + "는 자동차 회사입니다.");
	}
	//추상메소드 : 상속받는 자식클래스에서 받드시 오버라이딩 해야 한다.
	public abstract void feeling();
	
}
