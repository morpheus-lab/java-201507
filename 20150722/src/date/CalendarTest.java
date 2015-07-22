package date;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "�� ");
		
		int month = cal.get(Calendar.MONTH);
		System.out.print((month + 1) + "�� ");
		// 1��: 0, 2��: 1, ... , 12��: 11
		
		int date = cal.get(Calendar.DATE);
//		int date = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(date + "�� ");
		
		// 12�ð��� �ð�
//		int hour = cal.get(Calendar.HOUR);
		// 24�ð��� �ð�
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.print(hour + "�� ");
		
		int min = cal.get(Calendar.MINUTE);
		System.out.print(min + "�� ");
		
		int sec = cal.get(Calendar.SECOND);
		System.out.print(sec + "�� ");
		
		int ms = cal.get(Calendar.MILLISECOND);
		System.out.println(ms);
		
	}
	
}
