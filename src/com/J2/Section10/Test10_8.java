package com.J2.Section10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class Test10_8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader bufr = new BufferedReader(new FileReader("G:\\IO流笔记.txt"));
		
//		BufferedWriter bufw = new BufferedWriter();
		
		PrintWriter out = new PrintWriter("G:\\Num.txt");
		
		
		
		String line = null;
		int count = 0;
		
		
		while((line = bufr.readLine()) != null){
//			String b =  fw.write(line);
			
			
			out.println((count++)+":"+line);
		}
		
		bufr.close();
		out.close();
	}

}
