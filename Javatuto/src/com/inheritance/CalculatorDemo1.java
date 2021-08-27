package com.inheritance;

class Calculator {

	int left, right;

	public void setOprands(int left, int right) {
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

//
class SubstractionableCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		//SubstractionableCalculator클래스를 c1의 변수에 담아 인스턴스 화 시켰다.
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		//위의 메소드는 해당클래스에는 없다.
		//하지만 상위 클래스에는 있다.
		c1.substract();
		
	}
	
}