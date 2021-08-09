package com.abst.test01;

public class Hundai extends Car {
	String name; 
	@Override
	public void feeling() {
		System.out.println(this.name + "는 조립에 발을 이용한다고 합니다.");
	}
	public void function(String brand_name) {//추상 클래스의 일반 메소드는 반드시 구현하지 않아도 된다.
		super.function(this.name);//1. 아래 전역변수에 파라미터값을 너어주기 전인 이 코드의 this.name에는 아직 값이 들어가기 전이다.
		super.function(brand_name);//2. 하지만 이미 파라미터에는 값이 들어와 있어 여기에는 값이 뜬다.
		this.name = brand_name;
		super.function(this.name);
		System.out.println(brand_name + "를 저는 별로 좋아하지 않습니다.");
	}
	//부모 클래스의 전역변수는 자식클래스에 영향을 미치지 않는다.
	//부모클래스에서 바디가 있는 일반메소드의 내용을 쓰기위해서는 super.클래스명(아규면트)를 같은 이름으로 쓴다.

}
