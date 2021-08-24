package com.address;

import java.util.Scanner;

public class Address {
	//클래스 내부에서 유효한 전역변수?
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("번호선택");
			System.out.println("1: 전체출력");
			System.out.println("2: 선택출력");
			System.out.println("3: 추가");
			System.out.println("4: 수정");
			System.out.println("5: 삭제");
			System.out.println("6: 종료");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("전체출력");
				selectList();
				break;
			case 2:
				System.out.println("선택출력");
				selectOne();
				break;
			case 3:
				System.out.println("추가");
				insert();
				break;
			case 4:
				System.out.println("수정");
				update();
				break;
			case 5:
				System.out.println("삭제");
				delete();
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
			}
		}
	}
	
	private static void selectOne() {
		// TODO Auto-generated method stub
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	private static void selectList() {
		
	}
	

}
