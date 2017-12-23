package om.J2.Section6;

import java.util.Scanner;

public class Test2{  
    public static void main(String[] args) {
        for (int g = 0; g < 100; g++) {  
        	//输出年份
            Scanner in = new Scanner(System.in);  
            System.out.println("\n请输入年份：");  
            int year = in.nextInt();  
            //输出月份
            System.out.println("请输入月份：");  
            int month = in.nextInt();  
            int sum = 0;  
            int k = 0;  
            //判断是几月份
            for (int i = 1; i <= month - 1; i++) {  
            	//如果是二月份的执行下列语句
                if (i == 2) {  
                	//如果不是闰年的话执行下列语句
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  
                        sum = sum + 29;  
                    } else {  //如果是如年输出28
                        sum = sum + 28;  
                    }  
                } 
                //下列不是2月份的月份进行判定
                else { 
                	//进行判定是否是4，6，9，11月
                    if (i == 4 || i == 6 || i == 9 || i == 11) {  
                    	//如果是的话输出30天
                        sum = sum + 30;
                    } else {  
                    	//如果不是的话输出31天
                        sum = sum + 31;  
                    }  
                }  
            }
            for (int a = 1900; a <= year - 1; a++) {
            	//如果是不是润年的话输出366
                if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {  
                    sum = sum + 366;  
                }
                //如果是润年的话输出265
                else {  
                    sum += 365;  
                }  
            }  
            sum += 1;  
            //求wekday的余数求出星期几
            int wekday = sum % 7;  
            System.out.println("日\t一\t二\t三\t四\t五\t六");  
            for (int j = 1; j <= wekday; j++) {  
                System.out.print("\t");  
            }  
            //判断是否是润年
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  
            	//不是的话
                if (month == 2) {  
                	//输出29
                    k = 29;  
                }
                //如果是4，6，9，11月份的话是30天
                else if (month == 4 || month == 6 || month == 9 || month == 11) {  
                    k = 30;  
                } else {  
                	//如果不是的话输出31天
                    k = 31;  
                }  
            }
            //是闰月的话
            else {  
                if (month == 2) { 
                	//输出28
                    k = 28;  
                }
              //如果是4，6，9，11月份的话是30天
                else if (month == 4 || month == 6 || month == 9 || month == 11) {  
                    k = 30;  
                }
              //如果不是的话输出31天
                else {  
                    k = 31;  
                }  
            }  
            for (int i = 1; i <= k; i++) {  
            	//sum%7 == 6则还行
                if (sum % 7 == 6) {  
                    System.out.print(i + "\n");  
                }
                //如果不是的话则制表符继续输出
                else {  
                    System.out.print(i + "\t");  
                }  
                sum++;  
            }  
        }  
    }  
}  