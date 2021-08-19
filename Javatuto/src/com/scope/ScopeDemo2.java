package com.scope;

public class ScopeDemo2 {
	static int i;//클래스 바로 아래에 선언되는 것은 클래스에 직접적으로 속해있는 변수이다.
				//이것을 전역 변수라고 한다.
	
	static void a() {
		i = 0;//i의 값을 선언하진 않고 할당만 했다.
	}
	
	public static void main(String[] args) {
		for(i = 1; i < 5; i++) {//변수 iㄴ 
			a();//for문을 통해 i는 1로 변화된다 하지만 for문 안에서 a메소드가 실행되는 순간 i는 다시 0이된다.
			System.out.println(i);
			
		}
		
	}
}
