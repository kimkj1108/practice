package com.array;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		String[] members = {"kim", "lee", "bark"};
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + " is in the class");
		}
		System.out.println("all members in class");
	}

}
