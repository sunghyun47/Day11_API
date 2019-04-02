package com.google.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {

	public void ex1() {

		//주민번호 입력
		//마지막 번호는 체크용 번호로 따로 저장
		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7
		//*2 3 4 5 6 7   8 9 2 3 4 5
		//18+12+4+10.....
		//결과를 11로 나눈 나머지 구하기
		//나머지를 11로 뺀값을 체크용 번호랑 비교. 같으면 정상번호, 아니면 틀린번호
		//위의 결과값을 10으로 나눈 나머지를 체크번호랑 비교
		//하나꺼내서 숫자로 바꾸고 곱하고 더하고

		//숫자로 바꾸는방법
		//Char ch = jumin.charAt(jumin.length()-1); /1번
		//String name = ch+"";
		//name = String.valueOf(ch); /2번
		//name = Character.toString(ch); /3번

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");

		String jumin = sc.nextLine();
		char ch = jumin.charAt(jumin.length()-1);
		int check = Integer.parseInt(String.valueOf(ch)); //체크용 번호
		int sum = 0; //합계를 담을 변수
		int count = 2;//곱하기하는 변수

		for(int i=0; i<jumin.length()-1; i++) {
			char c = jumin.charAt(i); //문자를 하나 뺴냄

			if(!Character.isDigit(ch)) { //숫자형태가 아니라면
				continue;
			}
			String n = String.valueOf(c); //string으로 변환
			int num = Integer.parseInt(n);
			sum = sum+num*count; 
			count++; //다음에 count가 증가해야됨
			if(count >9) {
				count=2; //초기값으로 세팅
			}
		}
		sum = sum%11;
		sum = 11 - sum; //sum을 check랑 비교
		
		if(sum>9) { //두자리숫자가 나올수있으니 if문 (10,11,12 등..)
			sum = sum%10;
		}
		if(sum==check) {
			System.out.println("OK");
		}
		else {
			System.out.println("NO");
		}
		
		jumin = jumin.replace("-", "");
		System.out.println(jumin);
		
		int index = jumin.indexOf('-'); //index번호 찾기(빼기가 있는 인덱스 번호)
		String n1 = jumin.substring(0,index);
		String n2 = jumin.substring(index+1);

		String [] ar = jumin.split("-"); // - 빼기 기준으로 split
		
		
	}

}
