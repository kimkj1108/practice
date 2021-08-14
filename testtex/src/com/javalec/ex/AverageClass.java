package com.javalec.ex;

import java.util.Scanner;

public class AverageClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력 하세요");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력 하세요");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력 하세요");
		int meth = sc.nextInt();
		
		double avg = (kor + eng + meth) /3 ;
		System.out.println("평균점수는" + avg + "입니다." );
		
		if(kor>avg) {
			System.out.println("국어 점수는 평균 점수보다 높습니다.");
		}else if(kor<avg){
			System.out.println("국어 점수는 평균 점수보다 낮습니다.");
		}else {
			System.out.println("국어 점수는 평균 점수 입니다.");
		}
		
	}

}
