package com.J2.Section4;

/*
 * 程序功能：使用接口有哪些注意的事项？模仿例子4.27，编写一个类实现两个接口的程序
 * 程序员：魏国平
 * 编写时间：12月13日
 */

interface Animal
{
	void eat(String s);
	void show(String s);
}

class Cat implements Animal
{

	@Override
	public void eat(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}

class Dog implements Animal
{

	@Override
	public void eat(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal;
		
		animal = new Cat();
		animal.show("我会爬树");
		animal = new Dog();
		animal.eat("我吃骨头");
	}

}
