package com.inheritance;

class DivisAbleCal extends MultiplicationalbeCalculator{
	public void division() {
		System.out.println(this.right / this.left);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivisAbleCal c1 = new DivisAbleCal();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();  
	}

}
