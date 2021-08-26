package com.scope;

class C{
	int v = 10;//전역변수
	
	void m() {
		int v = 20;//지역변수
					//지역변수의 우선순위가 더 높아서 해당 코드가 있으면 20이 출력된다.
		System.out.println(v);
		System.out.println("this키워드 = "+this.v);//지역변수 우선순위 더 높다, 하지만 this키워드로 전역변수를 호출 했다. 
	}
	void n() {
		System.out.println(v);
	}
}

public class ScopeDemo7 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
		c1.n();
		
	}
}
