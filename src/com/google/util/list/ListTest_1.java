package com.google.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {

	public static void main(String[] args) {
		ListTest_1 lt = new ListTest_1();
		lt.ex1();
	}
	
	
	public void ex1() {
		
		//숫자 입력받아서 -> 3
		//해당 숫자만큼 랜덤한 숫자를 3개 생성해서
		//List 추가하고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		Random rd = new Random();
		ArrayList ar = new ArrayList(); //여기에다가 하나씩 추가
		for(int i=0; i<num; i++) {
			int number = rd.nextInt();
			ar.add(number);
		}
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
	}
	
	
	
}
