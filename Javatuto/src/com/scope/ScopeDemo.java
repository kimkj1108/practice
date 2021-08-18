package com.scope;

public class ScopeDemo {
	static void a() {
		int i = 0;//데모2와 달리 해당변수는 a라는 메소드 내부에서 선언되었다.
					//이것을 지역변수라고 한다.
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			a();//위의 변수 i는 해당 클래스 내에서만 유효 한 것이다.
			System.out.println(i);
		}
	}
}
