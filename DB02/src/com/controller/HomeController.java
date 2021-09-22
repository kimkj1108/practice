package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.HomeBiz;
import com.dto.HomeDto;

//화면 제어
public class HomeController {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("****\n").append("1.전체출력\n").append("2.선택출력\n")
		.append("3.추   가\n").append("4.수   정\n").append("5.삭   제\n").append("6.종   료\n").append("input select\n");
		System.out.println(sb);//sb에 각 메뉴를 주르륵 출력하게 하였고 이것을 출력하였다
		int select  = sc.nextInt();//int 타입 select라는 변수에 스케너를 통해 입력받은 값을 대입.
		return select;
	}
	//선택출력
	public HomeDto selectOne(int h_num) {
		
		return null;
	}
	//추가
	public int insert(HomeDto dto) {
		return 0;
	}
	//삭제
	public int delete(int h_num) {
		return 0;
	}
	public static void main(String[] args) {
		HomeBiz biz = new HomeBiz();
		
		int select = 0;
		
		while(select != 6) {
			select = getMenu();
			switch (select) {
			case 1:
				System.out.println("전체 출력");
				List<HomeDto> list = biz.selectList();
				for (HomeDto dto : list) {
					System.out.println(dto);
				}
				break;
			case 2:
				System.out.println("선택출력");
				System.out.println("출력할 번호 : ");
				int h_num = sc.nextInt();
				HomeDto selectOneDto = biz.selectOne(h_num);
				System.out.println(selectOneDto);
				break;
				
			}
		}
		
	}
	
	
}
