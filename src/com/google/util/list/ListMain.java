package com.google.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); //객체 생성
		
		Object e = ""; //다형성
		ar.add("1");
		ar.add(2); //int -> Integer : autoBoxing
		ar.add(3.12); //double -> Double : autoBoxing
		ar.add('a'); //char -> character : autoBoxing

		String s = (String)ar.get(0); //String으로 형변환
		int num = (int)ar.get(1);
		
		ar.add(1, "2000");
		ar.set(1, "500"); // 첫번째 500으로 바꿈
		
		//System.out.println(ar); //상속받은거 오버라이딩함 // [1, 2] 출력
		//ar.clear(); //전체삭제
		//ar.remove(1); //첫번쨰 삭제
		//ar.remove("2"); //두번째 삭제
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>(); //래퍼런스만 담을수있어서 Integer 대신 int 쓰면안됨
		ar2.add(1);
		//ar2.add("2");
		int n1 = ar2.get(0);
		
		//generic(이런타입넣도록 제안)
		
		
		
		
		
		
	}

}
