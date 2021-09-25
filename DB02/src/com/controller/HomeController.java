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
		sb.append("****\n").append("1.전체출력\n").append("2.선택출력\n").append("3.추   가\n").append("4.수   정\n")
				.append("5.삭   제\n").append("6.종   료\n").append("input select\n");
		System.out.println(sb);// sb에 각 메뉴를 주르륵 출력하게 하였고 이것을 출력하였다
		int select = sc.nextInt();// int 타입 select라는 변수에 스케너를 통해 입력받은 값을 대입.
		return select;
	}

	// 선택출력
	public HomeDto selectOne(int h_num) {

		return null;
	}

	// 추가
	public int insert(HomeDto dto) {
		return 0;
	}

	// 삭제
	public int delete(int h_num) {
		return 0;
	}

	public static void main(String[] args) {
		HomeBiz biz = new HomeBiz();

		int select = 0;

		while (select != 6) {
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
			case 3:
				System.out.println("추가");
				// 이름,직업
				System.out.println("이름");
				String h_name = sc.next();
				System.out.println("직업");
				String h_job = sc.next();
				
				HomeDto insertDto = new HomeDto(0, h_name, h_job);
				int insertRes = biz.insert(insertDto);
				if(insertRes > 0) {
					System.out.println("추가 성공!");
				}else {
					System.out.println("추가 실패!");
				}
				break;
			case 4:
				System.out.println("수정");
				System.out.println("수정할 번호 : ");
				int update_h_num = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String update_h_name = sc.next();
				System.out.println("수정할 직업 : ");
				String update_h_job = sc.next();
				HomeDto updateDto = new HomeDto(update_h_num, update_h_name, update_h_job);
				
				int updateRes = biz.update(updateDto);
				if(updateRes > 0) {
					System.out.println("수정성공!");
				}else {
					System.out.println("수정실패..ㅠㅠ");
				}
				break;
				
				case 5:
					System.out.println("삭제!");
					System.out.println("삭제할 번호 : ");
					int delete_h_num = sc.nextInt();
					
					int deleteRes = biz.delete(delete_h_num);
					
			}
		}

	}

}
