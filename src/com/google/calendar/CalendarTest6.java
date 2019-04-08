package com.google.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest6 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//ex)2019년 4월 8일 9시 13분
		//int year = calendar.get(Calendar.YEAR);
		//System.out.println(year+"년");
		
		String pattern = "yyyy년 MM월 dd일 HH:mm:ss E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);//찍어주는역할
		
		long now = calendar.getTimeInMillis();
		
		//Date date = new Date();
		//date.setTime(now);          	  //1번째 방법
		
		//Date date = new Date(now);     // 2번째 방법
		
		Date date = calendar.getTime();  // 3번쨰 방법
		
		
		String result = sd.format(date); //jajva.util.date 타입 들어가야됨
		System.out.println(result);
		
		
	}
}
