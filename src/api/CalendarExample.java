package api;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = "";
		switch (week) { 
		case Calendar.MONDAY: strweek = "월"; break; 
		case Calendar.TUESDAY: strweek = "화"; break; 
		case Calendar.WEDNESDAY: strweek = "수"; break; 
		case Calendar.THURSDAY: strweek = "목"; break; 
		case Calendar.FRIDAY: strweek = "금"; break; 
		case Calendar.SATURDAY: strweek = "토"; break; 
		case Calendar.SUNDAY: strweek = "일"; break; 
		
		}
		System.out.printf("%d년 %d월 %d일 (%s요일)\n", year, month, day, strweek);
		
	}

}
