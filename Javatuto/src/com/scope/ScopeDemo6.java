package com.scope;

public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	static void b() {
//		int i = 30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		a();//5가 나올거 같은데..실제로 5가 나왔다.
//		b()클래스에 만약 i가 재정의 된다면 위의 출력 결과는 30이 된다.
	}
}
