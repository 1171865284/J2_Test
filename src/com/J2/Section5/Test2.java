package com.J2.Section5;

/*
 * 程序功能：String类----concat()方法的使用
 * 程序员：魏国平
 * 编写时间：
 */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Wei";
		String str2 = "Gouping";
		

		//方法里面不用定义数据类型
		System.out.println(conCatDemo(str1, str2));
		
	}

	private static String conCatDemo(String str1, String str2) {

		String c = str1.concat(str2);
		
		//这个值返回到conCatDemo方法里面
		return c;
	}

}
