package com.constructor;


//Calculator클래스가 선안되었다.
class Calculator{
	int left, right;
	
	//Calculator클래스 안에 이름이 동일한 Calculator메소드가 선언되었다.
	//이것을 생성자(Constructor)라고 한다.
	//생성자는
	public Calculator(int left, int right) {
		this.left = left;//
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);	
	}
}

	

public class calculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
				
	}

}
