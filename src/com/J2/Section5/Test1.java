package com.J2.Section5;


/*
 * 程序功能：输出字符的大小写
 * 程序员：魏国平
 * 编写时间：12月21日
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "adfghkjaGHJGHJ";
		
		
		toBig(str);
		
		toSmall(str);
		
		toBogORSmall(str);
		
	}

	private static void toBogORSmall(String str) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		if (str != "" || str != null) {
			//将字符串遍历一遍
			for (int i = 0; i < str.length(); i++) {
				//将字符串转换成为字符数组
				char c = str.charAt(i);
				if (Character.isUpperCase(c)) {
					
				}
			}
		}
	}

	private static void toSmall(String str) {
		// TODO Auto-generated method stub
		
		if (str!="" || str != null){
			String small = str.toLowerCase();
			System.out.println(small);
		}else {
			System.out.println("请输入字符串");
		}
		
		
		
	}

	public static void toBig(String str) {
		// TODO Auto-generated method stub
		
		if (str!="") {
			String big = str.toUpperCase();
			System.out.println(big);
		}else {
			System.out.println("请输入字符串");
		}
	}

}
