package com.classninstance;

//클래스메소드, 인스턴스메소드
//1. 인스턴스메소드(static키워드 없는)는 클래스 맴버에 접근 할 수 잇다.
//2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
class C1{
	
	static int static_variable = 1;//클래스 변수
	int instance_variable = 2;//인스턴스 변수
	static void static_static() {//클래스 메소드
		System.out.println(static_variable);
	}
	static void static_instance() {
		//클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
		//System.out.println(instance_variable);
	}
	void instance_static() {
		//인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
		System.out.println(static_variable);
	}
}


public class CalculatorDemo03 {
	public static void main(String[] args) {
		C1 c = new C1();//C1을 담을수 있는 변수 c에 인스턴스를 담았다.
		
		c.static_static();
	}
}
//인스턴스 변수 -> Non-Static Field
//클래스 변수 -> Static Field





