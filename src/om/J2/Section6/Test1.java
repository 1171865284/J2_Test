package om.J2.Section6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	/*
	 * MILLISECOND 秒
	 * MINUTE	分
	 * DAY_OF_WEEK 星期
	 * HOUR_OF_DAY 小时
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.println(getweek(week)+"  "+hour+"时"+minute+"分"+millisecond+"秒");
		
	}

	private static String getweek(int i) {
		// TODO Auto-generated method stub
		
		String[] weeks = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		return weeks[i];
	}
}
