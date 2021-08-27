package com.inheritance;

class MultiplicationalbeCalculator extends Calculator{
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}
public class CalculatorDemo2 {
	public static void main(String[] args) {
		
		MultiplicationalbeCalculator c1 = new MultiplicationalbeCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}
	
	
}
