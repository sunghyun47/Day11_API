package com.google.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {

		String now = "2020-05-05";
		
		//문자열 -> Calendar
		//java.text.simpleDateFormat
		
		SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
		Date d = st.parse(now);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);//date타입을 calendar 클래스로 바꺼주기
		
		
		System.out.println(calendar.get(calendar.MONTH));
		
	}

}
