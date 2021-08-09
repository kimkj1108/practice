package com.method;

public class MethodDemo6 {
	//method num이 return하는 값의 타입은 반드시 String이다.
	public static String num(int init, int lim) {
		int i = init;
		String output ="";
		while(i < lim){
			output += i;//output = output + i
			i++;
		}
		return output;//굳이 리턴값을 사용해야 하나?
	}
	public static void main(String[] args) {
		//method num에 아규먼트 1,5를 전달, 아규먼트는 해당 값을 받고 
		//return한 output의 값이 result에 담길 것이다. 	
		String result = num(1,5);//method num은 String이기 때문에 리턴값을 담을 result라는 컨테이너의 타입 역시 String이어야 한다.
		System.out.println(result);
	}
}
