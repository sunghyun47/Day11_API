package com.google.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//생일 세팅
		//요일이 무슨요일
		cal.set(1991, 4, 19);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//int d = cal.get(Calendar.DATE) + 3;
		//cal.set(Calendar.DATE, d);
		
		System.out.println("month : " + cal.get(Calendar.MONTH));
		// cal.roll(Calendar.DATE, 28); //몇일뒤
		cal.add(Calendar.DATE, 28);
		System.out.println("month : " + cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		

		
	}

}
