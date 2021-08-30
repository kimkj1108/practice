package com.inheritance.example;

public class ConstructorDemo {
	//1.자바는 클래스명과 같은 기본 생성자를 암시적으로 만든다.
	//이것은 매개변수와 바디가 없다.
	public ConstructorDemo() {}
	
	//2.만약 아래와 같이 매개변수가 있고 클래스명과 같은 생성자를 만들면
	//자바는 암시적으로 기본생성자를 만들지 않는다.
	public ConstructorDemo(int a) {} 
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
}
