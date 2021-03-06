package com.object;

//이 클래스는 3개의 method를 가지고 있습니다.
class Calculator{
	int left, right; // Calculator객체 전역에서 접근할 수 있는 변수
	
	public void setOperands(int left, int right) {//파라미터(매개변수)는 인자값(아규먼트)를 받아들인다.
		this.left = left;
		this.right = right;
	//this.이 가르키는 것은 전역변수이다.
	//left는 아규먼트를 통해 파라미터로 전달된 값이다.
	//즉, 파라미터로 전달된 값을 전역변수로 전달 하는 것이다.
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();//new를 통해서 우리는 인스턴스를 생성했고 이것을 변수 c1에 담았다...
		c1.setOperands(10, 20);			//인스턴스의 설계도에 해당되는 클래스는 위에 있다 -->'class Calculator'
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	}

}
