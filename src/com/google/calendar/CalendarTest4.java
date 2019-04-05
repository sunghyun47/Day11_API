package com.google.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest4 {

	public static void main(String[] args) {
		
		//3시50분 : 3-50
		//들어온시간 나간시간 차를 계산하여 돈계산
		//시간당 1,000원
		Scanner sc = new Scanner(System.in);
		Calendar in = Calendar.getInstance(); //들어온시간
		Calendar out = Calendar.getInstance(); //나간시간
		
		System.out.println("종료시간을 입력하세요");
		String time = sc.next();
		
		String [] times = time.split("-");
		out.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0])); //시간
		out.set(Calendar.MINUTE, Integer.parseInt(times[1]));//분
		
		long inTime = in.getTimeInMillis(); // 들어온시간 밀리세컨즈로 변환
		long outTime = out.getTimeInMillis();
		long result = outTime-inTime;
		long h = result / (1000*60*60); //시간으로 환산
		long m = result % (1000*60*60);
		System.out.println(h);
		
		if(m>0 ) {
			h++;
		}
		
		if(h<1 ) {
			h=1; //기본요금
		}
		
		System.out.println("최종요금 : " + h*1000);
		
		
		
		
	}
	
}
