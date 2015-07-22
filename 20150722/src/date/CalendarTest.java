package date;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "년 ");
		
		int month = cal.get(Calendar.MONTH);
		System.out.print((month + 1) + "월 ");
		// 1월: 0, 2월: 1, ... , 12월: 11
		
		int date = cal.get(Calendar.DATE);
//		int date = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(date + "일 ");
		
		// 12시간제 시간
//		int hour = cal.get(Calendar.HOUR);
		// 24시간제 시간
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.print(hour + "시 ");
		
		int min = cal.get(Calendar.MINUTE);
		System.out.print(min + "분 ");
		
		int sec = cal.get(Calendar.SECOND);
		System.out.print(sec + "초 ");
		
		int ms = cal.get(Calendar.MILLISECOND);
		System.out.println(ms);
		
	}
	
}
