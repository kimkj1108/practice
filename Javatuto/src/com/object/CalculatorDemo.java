package com.object;

public class CalculatorDemo {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	public static void main(String[] args) {

		System.out.println(10+20);
		System.out.println(20+40);
		//위 코드에서는 + 가 중복된다. 이런 중복은 제거되어야 할 대상이다.
		//refactiring
		sum(10,20);
		sum(20,40);
	}

}
