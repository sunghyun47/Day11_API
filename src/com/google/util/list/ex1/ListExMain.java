package com.google.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {

		//1. 정보입력
		//   이름 입력
		//   나이 입력
		//2. 정보출력
		//   모든정보 출력
		//3. 종료
		
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList(); //이름,나이
		ListExInput li = new ListExInput(); //input 하기위해 객체만듬
		ListExView lv = new ListExView();
		
		while(true) {
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				//ar = li.setInfo();
				li.setInfo(ar);
				
			}
			else if(select==2) {
				lv.view(ar);
			
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
			
			
			
		}
		
		
		
		
		
	
		
		
		
	}

}
