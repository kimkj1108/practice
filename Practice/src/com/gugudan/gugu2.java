package com.gugudan;

public class gugu2 {
	public static void gugudan() {
		System.out.println("구구단시작");
		for(int i = 2; i < 10;i++) {
			System.out.println(i+"단 시작");
			for(int j = 1;j < 10; j++) {
				int k = i*j;
				System.out.println(i + " * " + j + " = " + k);
			}
		}
		System.out.println("  ");
		System.out.println("구구단 끝");
	}
	public static void main(String[] args) {
		gugudan();
	}

}
