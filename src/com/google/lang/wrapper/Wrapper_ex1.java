package com.google.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	
	public void ex2() {
		
		//비밀번호 입력
		//대문자 1개이상, 소문자 1개이상, 공백X, 숫자1개이상
		//최소 6자이상

		int count = 0; //문자열의 길이를 담을 변수
		int upper = 0; //대문자의 갯수를 담을 변수
		int lower = 0; //소문자의 갯수를 담을 변수
		int digit = 0; //숫자의 갯수를 담을 변수
		int space = 0; //공백의 갯수를 담을 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력");
		String pw = sc.nextLine(); //공백포함 여부
		
		count = pw.length();
		if(count>5) {
			for(int i=0; i<count; i++) {
				char ch = pw.charAt(i);
				if(Character.isUpperCase(ch)) {
					upper++;
				}
				else if(Character.isLowerCase(ch)) {
					lower++;
				}
				else if(Character.isDigit(ch)) {
					digit++;
				}
				else if(Character.isWhitespace(ch)) {
					space++;
				}
				else {
					
				}
			}// for
			
			if(upper>0 && lower>0 && digit>0 && space==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("최소 6글자 이상");
		}
		
	}
	

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
