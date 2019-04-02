package com.google.util.random;

//import java.lang.* 생략됨
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		
		RandomEx_1 re = new RandomEx_1();
		re.ex4();
		
		//맴버매서드 생성 -> 객체생성 먼저
		Random rd = new Random();
		int num = rd.nextInt(); //int형이 나타낼수있는 최소~최대사이 난수 출력
		System.out.println("===========");
		System.out.println(num);
		
		num = rd.nextInt(5); // 0~5미만의 숫자
		System.out.println(num); // 5미만 숫자 난수 출력
		
		
		
		
		
		
		
		
		
	}

}
