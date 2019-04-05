package com.google.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		//ca2.set(Calendar.MINUTE, 40);
		ca2.add(Calendar.DATE, 2);
		
		long l = ca.getTimeInMillis(); //l에는 현재시간을 밀리세컨즈로
		long l2 = ca2.getTimeInMillis();
		long l3 = l2-l; //두개의 시간차
		
		System.out.println(l3/(1000*60)); //분으로 환산
		
		
		
	}

}
