package com.singleton;

public class Mtest {
	public static void main(String[] args) {
		
		Singleton st01 = Singleton.getInstance();
		System.out.println(st01);
		Singleton st02 = Singleton.getInstance();
		System.out.println(st02);
		Singleton st03 = Singleton.getInstance2();
		System.out.println(st03);
		
		
	}

}
