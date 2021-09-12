package com.dto;

//값 전달 객체
//Data Transfer Object(= Value Object)
public class HomeDto {
	
	//1. 필드값 셋팅
	private int h_num;
	private String h_name;
	private String h_job;
	
	//2. 파라미터를 초기화하는 생성자
	public HomeDto(int h_num, String h_name, String h_job) {
		super();
		this.h_num = h_num;
		this.h_name = h_name;
		this.h_job = h_job;
	}
	
	//3. 기본생성자
	public HomeDto() {
	}

	//gatter & setter
	public int getH_num() {
		return h_num;
	}

	public void setH_num(int h_num) {
		this.h_num = h_num;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_job() {
		return h_job;
	}

	public void setH_job(String h_job) {
		this.h_job = h_job;
	}

	//toString..이놈..이놈 역할은 내가 지금 뭔지 잘 기억이 안나...
	@Override
	public String toString() {
		return "HomeDto [h_num=" + h_num + ", h_name=" + h_name + ", h_job=" + h_job + "]";
	}
	
	
	
	

	
	/*
	//기본생성자
	public HomeDto(int update_h_num, String update_h_name, String update_h_job) {
	}
	//파라미터 초기화 하는 생성자
	public HomeDto(int h_num, String h_name, String h_job) {
		super();
		
	}
	*/
	
}
