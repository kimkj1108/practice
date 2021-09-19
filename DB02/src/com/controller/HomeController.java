package com.controller;

import java.util.Scanner;

//화면 제어
public class HomeController {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenue() {
		StringBuffer sb = new StringBuffer();
		sb.append("****\n").append("1.전체출력\n").append("2.선택출력\n")
		.append("3.추   가\n").append("4.수   정\n").append("5.삭   제\n").append("6.종   료\n").append("input select\n");
		
		return 0;
	}
}
