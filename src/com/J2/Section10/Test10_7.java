package com.J2.Section10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
 * 程序功能：使用RandomAccessFile将文本文件倒置读出
 * 程序员：魏国平
 * 编写时间：
 */
public class Test10_7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("G:\\PrintW_2.txt");
		
		byte[] buf = new byte[1024];
		
		int len = fis.read(buf);
		
		//将数据封装到一个字节数组当中
		char[] c = new String(buf, 0, len).toCharArray();
		
		for(int i = c.length-1; i >= 0; i--){
			System.out.print(c[i]);
		}
		
		fis.close();
	}

}
