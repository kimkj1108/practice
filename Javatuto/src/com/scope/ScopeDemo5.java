package com.scope;

public class ScopeDemo5 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i);//위의 변수 i는 for문 안에서 선언되어서 그 외부에서는 유효하지 않다. 따라서 해당 문장은 존제하지 않는 i를 호출하고 있기에 에러가 나는 것이다.
	}

}
 