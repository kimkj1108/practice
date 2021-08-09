package com.abst.test01;

public class MTest {
	public static void main(String[] args) {
		Car hundai = new Hundai();
		hundai.function("현대");
		hundai.feeling();
		
		Car kia = new Kia();
		kia.function("기아");
		kia.feeling();
	}

}
