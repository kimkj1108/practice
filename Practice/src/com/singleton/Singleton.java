package com.singleton;
//메모리영역(Heap)에 객체를 한 번만 생성.
//싱글톤은 디자인 패턴의 하나.
public class Singleton {
	
	//2. 객체를 확인할 주소를 담아줄 변수 선언.
	private static Singleton singleton;
	private static Singleton singleton2;
	
	//1. 생성자를 외부에서 생성하지 못하도록, private으로 만든다.
	private Singleton() {
		System.out.println("singleton instance 생성!");
	}
	
	//3. 객체를 생성해주는 메소드를 만든다.
	public static Singleton getInstance() {
		if(singleton == null) {
			System.out.println("new");
			//인스턴스 생성
			singleton = new Singleton();
		}else {
			System.out.println("exists!");
		}
		return singleton;
	}
	public static Singleton getInstance2() {
		Singleton s = new Singleton();
		System.out.println("what!?");
		return s;
				
	}
	

}
