package com.db;

import java.util.Scanner;

public class Member {
	
	//스캐너 객체 생성.
	static Scanner sc = new Scanner(System.in);
	
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
			
			switch(select){
			case 1:
				System.out.println("전체출력");
				selectList();
				break;
			case 2:
				System.out.println("선택출력");
				selectOne();
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
	//1. driver 연결
	//2. 계정연결
	//3. query준비
	//4. query실행 및 리턴
	//5. db 종료
	

}
