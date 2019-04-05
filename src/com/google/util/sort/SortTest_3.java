package com.google.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortTest_3 {

	public static void main(String[] args) {

		Member member = new Member("cc", 20);
		System.out.println("객체주소 :" +member);
		
		Member member2 = new Member("cc", 20);
		System.out.println(member == member2);
		System.out.println(member.equals(member2));
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
		
		/*
		Member m1 = new Member("aa", 25);
		Member m2 = new Member("bb", 32);
		Member m3 = new Member("cc", 16);
		Member m4 = new Member("dd", 26);
		
		ArrayList<Member> ar = new ArrayList<Member>(); //3개 객체 리스트에 담기
		ar.add(m1);
		ar.add(m2);
		ar.add(m3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 나이순, 2. 이름순");
		int select = sc.nextInt();
		
		
		Collections.sort(ar);//리스트정렬 ( Member클래스에서 implements Comparable<Member> 받아야됨)
		
		//나이순
		for(int i=0; i<ar.size(); i++) {
			System.out.println("id : " + ar.get(i).getId());
			System.out.println("age : " + ar.get(i).getAge());
			System.out.println("==========================");
	
		}
		*/
		
//		ArrayList<String> ar = new ArrayList<String>();
//		ArrayList<String> ar2 = new ArrayList<String>();
//		ArrayList<ArrayList<String>> ar3 = new ArrayList<ArrayList<String>>();
//		ar3.add(ar2);
//		ar3.add(ar);
//		//HashMap<ArrayList<String>, ArrayList<String>> map = new ArrayList();
//		//map.put(ar, ar2);
		
		
	}
	public static void sort(List<Comparable<Object>> ar ) {
		int num = ar.get(0).compareTo(ar.get(1));
		if(num>0 ) { 
			
		}
		else if(num<0 ) {
			
		}
		else {
			
		}
	}
	

}
