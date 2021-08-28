package com.my.algorithm;

public class Max_test {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		System.out.println("max4's max value is " + max);
		return max;
	}
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min =c;
		System.out.println("min3's min value is " + min);
		return min;
	}
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min =c;
		if (d < min) min = d;
		System.out.println("min4's min value is " + min);
		return min;
	}
	public static void main(String[] args) {
		max4(1, 2, 3, 4);
		min3(1, 2, 3);
		min4(1, 2, 3, 4);
		max4(4, 3, 2, 1);
		max4(4, 3, 4, 3);
		min3(2, 3, 3);
		min3(3, 2, 1);
	}

}
