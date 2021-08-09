package com.array;

public class ArrayLoopPractice {
	public static void main(String[] args) {
		String [] members = {"우공스","정구스","니지스","토리스","핀스쿵스"};
		for(int i = 0; i <members.length; i++) {
			String member = members[i];
			if(i<1) {
				System.out.println(member+"는 집에 있어요");
			}else {
				System.out.println(member+"도 집에 있어요");
			}
		}
		System.out.println("모두 집에 있네요");
	}

}
