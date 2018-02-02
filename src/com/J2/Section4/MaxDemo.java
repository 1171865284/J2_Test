package com.J2.Section4;

public class MaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		agv();
	}

	private static void agv() {
		// TODO Auto-generated method stub
		String [] name = new String [] {"景珍","林惠阳","成荣","红南昌",
	            "荣誉名","单开开","天武山","王三名"};
	            int [] score = new int[]{90,65,88,70,46,81,100,68};
	            int sum = 0;
	            int agv = 0;
	            for (int i = 0; i < score.length; i++) {
					sum += score[i];
					agv = sum / score.length;
				}
	            for (int i = 0; i < score.length; i++) {
					if (score[i] > agv) {
						System.out.println(name[i]);
					}
				}
	}

	/**
	 * 
	 */
	public static void MaxMethod() {
		int [] a = new int []{74,489,46,4,656, 999};
		int max = a[0];
		int index = 0;//这样可以记录最大值的索引
		for (int i = 0; i < a.length; i++) {
			if(max < a[i]){
				max = a[i];
				index = i;//记录最大值的索引
			}
		}
		System.out.println("最大值："+ max);
	}

}
