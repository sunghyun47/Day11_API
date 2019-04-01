package com.google.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex1() {
		
		//주민번호 입력
		//1. 나이가?
		//2. 3~5월 : 봄, 6~8월 : 여름, 9~11월 : 가을, 12~2월 : 겨울
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String jumin = sc.next();

		String month = jumin.substring(2, 4); //해당부분 들어냄
		int m = Integer.parseInt(month);
		
		if(m>=3 && m<=5) {
			System.out.println("봄");
		}
		else if(m>=6 && m<=8) {
			System.out.println("여름");
		}
		else if(m>=9 && m<=11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
	
		
		
		
		
	}
	
	
}
