package com.J2.Example9;

public class Example9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People teacher, student;
		ComputerSum sum = new ComputerSum();
		teacher = new People("老师", 200, sum);
		student = new People("学生", 200, sum);
		teacher.start();
		student.start();

	}
}

class ComputerSum{
	int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}

class People extends Thread{
	int timelength;
	ComputerSum sum;
	public People(String s, int timelength, ComputerSum sum) {
		super();
		setName(s);
		this.timelength = timelength;
		this.sum = sum;
	}
	
	public void run(){
		for(int x = 0; x <=5; x++){
			int m = sum.getSum();
			sum.setSum(m+1);
			System.out.println("我是"+getName()+", 现在的和是：" +sum.getSum());
			try {
				sleep(timelength);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
