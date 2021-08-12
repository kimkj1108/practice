package com.classninstance;

//클래스 변수에 대하여.

class Calculator {
	//static키워드가 있는 변수는 모든 인스턴스에서 동일한 값을 가지게 된다..??
	static double PI = 3.14;//앞에 스테틱이 붙은 해당 변수는 클래스의 맴버이다.
	int left, right;//앞에 스테틱이 붙어있지 않은 해당 변수는 인스턴스의 맴버이다.
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
	public class CalculatorDemo01{
		public static void main(String[] args) {
			
			//클래스 변수로 만든 PI에 접근하는 방법
			Calculator c1 = new Calculator();
			System.out.println(c1.PI);//인스턴스를 만들어 접근하는 방법
			
			Calculator c2 = new Calculator();
			System.out.println(c2.PI);
			
			System.out.println(Calculator.PI);//인스턴스의 설계도라고 할 수 있는 클래스를 통해서도 접근 할 수 있다.
		}
		
	}
