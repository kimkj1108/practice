package com.inheritance.example;


	class Calculator {
		int left, right;

		public Calculator(int left, int right) {
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
	class SubstractCal extends Calculator{
		public SubstractCal(int left, int right) {
			super(left, right);
			//상속받은 이후 부모 클래스 생성자 초기화를 하고
			//하위 클래스의 생성자 초기화 하는 것도 가능하다.
			//단 하위 클래스 초기화는 super클래스 초기화 이후여야 한다.
		}
		public void substract() {
			System.out.println(this.left - this.right);
		}
		
	}
	public class ConstructorDemo2 {
		public static void main(String[] args) {
			SubstractCal c1 = new SubstractCal(10, 20);
			c1.sum();
			c1.avg();
			c1.substract();
		}
}
