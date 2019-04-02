package com.google.string;

import java.util.Scanner;

public class StringEx_1 {

	public void ex5() {
		
		//jpg, png, gif
		//업로드할 파일명 입력
		//이 파일이 이미지인지 아닌지 구별
		//이미지 아니라면 이미지만 업로드 가능
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력하세요");
		String name = sc.next();
		
		int i = name.indexOf(".");
		String result = name.substring(i+1);
		System.out.println(result);
		
	}
	
	
	public void ex4() {
		
		//id입력 - 이메일형식(@)
		//최대 10글자 이하로만
		Scanner sc = new Scanner(System.in);
		boolean check1 = false; //id의 길이가 맞는지 여부
		boolean check2 = false; //email 형식 여부
		System.out.println("id 입력하세요");
		String id = sc.next();
		
		if(id.length()<11) {
			check1 = true;
		}
		
		int index = id.indexOf("@"); //못찾응면 인덱스 -1
		if(index != -1) {
			check2 = true;
		}
		if(check1 && check2) {
			System.out.println("쓸수 있는 아이디");
		}
		else {
			System.out.println("슬쑤 없는 아이디");
		}
	}
	
	public void ex3() {
		
		//문자열 입력받고
		//글자당 100원
		//총가격은?
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = sc.next();
		int result = str.length() * 100;
		System.out.println("총 가격 : " + result);
	}
	
	public void ex2() {
		
		//i 글자가 몇개?
		String name = "Mississippi";
		int i = -1; //index번호 담음
		int count = 0; //몇개인지 숫자담음
		while(true) {
			i = name.indexOf("i", i+1);
			if(i != -1) {
				count++;
			}
			else {
				break;
			}
			
		} //while
		
		System.out.println("count :" + i+1);
		
	}
	
	public void ex1() {
		
		//ex1 메서드 생성
		//주민번호 입력 999999-1234567
		//남자, 여자인지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요");
		
		String jumin = sc.next();
		char ch = jumin.charAt(7);
		
		if(ch == '1'|| ch == '3' || ch=='5') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		
		
	}
	
	
	
}
