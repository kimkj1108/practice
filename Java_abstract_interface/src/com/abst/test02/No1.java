package com.abst.test02;

public class No1 extends Car {


	
//	암시적 슈퍼 생성자 Car()는 기본 생성자에 대해 정의되지 않습니다. 명시적 생성자를 정의해야 합니다.
//	하위클래스의 생성자에서 super()변수를 사용하여 추상클래스의 생성자를 부르고 초기화 시킨다.
	public No1(String brand, String name) {
		super(brand, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speed() {
	}

	@Override
	public void BrakingPower() {
	}
	//아래 메서드는 생성은 가능하나 출력 할 수가 없다. 왜지..
	public void Sum(int left, int right) {
		int res = left + right;
		System.out.println(res);
	}

}
