package com.javalec.switchEx;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int r = i % 2;
		
		switch (r) {
		case 0:
			System.out.println("짝수 입니다.");
			break;//break를 만나면 빠져나온다.
		case 1:
			System.out.println("홀수 입니다.");
			break;
		default:
			System.out.println("모르겠습니다.");
			break;
		}
	}
}
