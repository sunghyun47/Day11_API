package com.google.util.random;

import java.util.Random;

public class RandomEx_1 {
	

	public void ex4() {
		
		//10% 확률로 2단계 성공
		//20% 확률로 1단계 성공
		//70% 확률로 실패
		Random random = new Random();
		int [] nums = {0,0,0,1,0,2,0,1,0,0};
		int index = random.nextInt(nums.length); //인덱스번호 출력
		int num = nums[index];
		
		if(num==0) {
			System.out.println("실패");
		}
		else {
			System.out.println(num+ " 강화 성공");
		}
		
		
	}

	public void ex3() {
		
		//6개중 1개만 랜덤출력
		String [] foods = {"떡볶이","냉면","순대국","육개장","해장국","굶기"};
		Random random = new Random();

		int index = random.nextInt(6); //0~6미만 숫자 /6대신 foods.length 넣어도됨
		System.out.println(foods[index]);
		
	}
	

	public void ex2() {
		
		//1~45번까지 숫자 6개
		int [] lotto = new int[6]; //숫자하나씩을 배열한칸에
		Random random = new Random(); //객체생성
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
	
	public void ex1() {

		//6개 숫자 출력
		//1~45
		Random rd = new Random();
		for(int i=0; i<6; i++) {
			System.out.println(rd.nextInt(44)+1); //0 나오는거 방지(0은 1, 1은 2)
		}
		
	}
	
	
	
	
}
