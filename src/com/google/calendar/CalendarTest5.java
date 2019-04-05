package com.google.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3, 1); //4월
		int max = ca.getActualMaximum(Calendar.DATE); //해당월의 마지막일
		int day = ca.get(Calendar.DAY_OF_WEEK)-1;
		//System.out.println(max); //4월은 30일까지있음
		
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println(); //엔터
		for(int i=0; i<day; i++ ) {
			System.out.print("\t");
		}
		for(int i=1; i<=max; i++ ) {
			System.out.print(i+"\t");
			//if((i+day)%7==0) { //밑에코드랑 같음
			if(i%7==(7-day) ) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println("year : " + Calendar.YEAR);
		System.out.println("month : " + Calendar.MONTH);
		System.out.println("date : " + Calendar.DATE);
		System.out.println(ca.getTime());
		
		
		
		
	}

}
