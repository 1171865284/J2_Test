package com.J2.Section4;

public class Test17 {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.speak(10001);
	}

}

class Student
{
	public void speak(int m) throws MyException
	{
		if (m > 1000) {
			throw new MyException("我们学校招满了");
		}
	}
}

class MyException extends Exception
{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	MyException(String msg)
	{
		super(msg);
	}
}
