package com.J2.Example9;

public class Example9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Left left;
		Right right;
		//创建线程
		left = new Left();
		right = new Right();
		left.start();
		right.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("我是主线程");
		}
	}

}

class Left extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("我是左手线程");
		}
	}
	
}

class Right extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("我是右手");
		}
	}
	
}
