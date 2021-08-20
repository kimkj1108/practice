package com.scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding";
	}
	public static void main(String[] args) {
		a();
		//System.out.println(title);
	}
}
