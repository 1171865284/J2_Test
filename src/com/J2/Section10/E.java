package com.J2.Section10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class E {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double x = 98.8909;
		boolean b = true;
		
		PrintStream ps = new PrintStream(new FileOutputStream("G:\\p.txt"));
		
		ps.println("你好");
		ps.println(x);
		ps.println(b);
		ps.close();
	}

}
