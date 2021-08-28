package com.my.algorithm;

import java.util.Scanner;
//3개의 정수값을 입력하고 최댓값을 구합니다.
public class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		int max = a;	
		/*
		if(b > max) {
			max = b;
			}else if(c > max) {
				max = c;
			}else {
				max = a;
			}
			*/
		//위 코드의 문제점 : b가 더 큰 값이면 max에 b가 대입되고 if문은 break
		if(b > max) max = b;
		if(c > max) max = c;
		System.out.println("최댓값 = " + max);
		
		
		
	}

}
