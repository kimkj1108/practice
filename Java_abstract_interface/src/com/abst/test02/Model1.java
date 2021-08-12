package com.abst.test02;

public class Model1 extends Car {

	public Model1(String name, String brand) {
		super(name, brand);
		// TODO Auto-generated constructor stub
		
		//여기에 입력한 값은 어디로 가는걸까...
		brand = "hunda";
		name = "konan";
		System.out.println("확장된 기능.");//
		
	}
	//오버라이드 한 아래 두 메서드들은 내용이 없어도 된다.

	@Override
	public void Speed() {
	}
	@Override
	public void BrakingPower() {
		System.out.println("브레이크 잘들어요");
	}
}
