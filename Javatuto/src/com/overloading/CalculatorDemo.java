package com.overloading;

//오버라이드 예제
class Calculator{
	
	int one, two;
	int three = 0;
	
	public void setOperands(int one, int two) {
		System.out.println("setOperands(int one, int two)");
		this.one = one;
		this.two = two;
	}
	public void setOperands(int one, int two, int three) {
		this.setOperands(one, two);//아래 중복되는 코드를 이렇게 수정하였다.
		System.out.println("setOperands(int one, int two, int three)");
//		this.one = one;
//		this.two = two;
		
		this.three = three;
		}
	public void sum() {
		System.out.println(this.one+this.two+this.three);
		}
	public void avg() {
		if(this.three>1) {
			System.out.println((this.one+this.two+this.three)/3);
		}else {
			System.out.println((this.one+this.two+this.three)/2);
		}
	}

}	
public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
		
		
		
	}

}
