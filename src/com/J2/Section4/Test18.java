package com.J2.Section4;

/*
 * 程序功能：求最小公倍数和最大公约数
 * 程序员：魏国平
 * 编写时间：12月13日
 */

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max max = new Max();
		// 求最大公约数
		System.out.println(max.f(18, 102));
		Min min = new Min();
		// 求最小公倍数
		System.out.println(min.f(18, 102));
	}

}

class Max {
	public int f(int a, int b) {
		if (a < b) {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

}

class Min extends Max {
	public int f(int a, int b) {
		int m;
		m = super.f(a, b);
		return (a * b) / m;
	}
}
