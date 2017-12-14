package com.J2.Section4;

/*
 * 程序功能：输出字母表和希腊字母表
 * 程序员：魏国平
 * 编写时间：12月13日
 */

class A
{
	void f()
	{
		for(int i = 65; i <= 90; i++)
		{
			System.out.print((char)i + " ");
		}
	}
}

class B extends A{
	void g()
	{
		for (int i = 945; i < 975; i++) {
			System.out.print((char)i + " ");
		}
	}
}
public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.f();
		System.out.println();
		b.g();
		
	}

}
