package com.google.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		//추상클래스는 new 생성X
		//현재 시간을 담음
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//특정 날짜 데이터를 꺼낼때, get
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//현재 몇분
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		//월 출력
		int mon = cal.get(Calendar.MONTH);
		System.out.println(mon+1); //0부터 시작하니깐 +1해줘야됨
		
		//년도를 2100으로 바꿀때
		cal.set(Calendar.YEAR, 2100); 
		System.out.println(cal.get(Calendar.YEAR));
		
		//1월로 바꾸기
		cal.set(Calendar.MONTH, 0); //0나오게 해줘야지 +1해서 1월출력됨
		System.out.println(cal.get(Calendar.MONTH));
		
		cal.set(Calendar.HOUR_OF_DAY,22);
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		
		
		

		
		
		
		
	}

}
