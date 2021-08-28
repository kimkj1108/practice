package com.my.algorithm;

public class Max3_1 {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println("최댓값은 " +max+"입니다.");
		return max;
	}

	public static void main(String[] args) {
		max3(1, 2, 3);
		max3(500, 5154, 564);
	}
}
