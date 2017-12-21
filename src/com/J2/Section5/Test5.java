package com.J2.Section5;

import java.util.Arrays;

public class Test5
{
	public static void main(String[] args) {
		/*char a1[] = {'a','b','c','d','e','f'}, b1[] = {'1', '2', 'b', '4', '5', '6'};
		//System.arraycopy(需要copy的字符数组的， 利用角标定义从哪里开始coye, paste在那个数组， 利用角标定义从哪里开始paste, 需要copy的数组长度)
		//若是粘贴的长度空间不够会出现异常
		System.arraycopy(a1, 0 , b1, 3, a1.length-3);
		System.out.println(new String(a1));
		System.out.println(new String(b1));*/
		char a2[] = {97, 98, 99, 100, 101, 102}, b2[] = {65, 66, 67, 68, 69, 70, 71};
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(b2));
		System.arraycopy(b2, 0, a2, 1, b2.length-3);//length-3也就是说b2数组长度减去三位后三位不输出
		System.out.println(new String(a2));
		System.out.println(new String(b2));
		/*
		 * 输出结果：
		 * aABCDf
			ABCDEFG
		 */
	}
}