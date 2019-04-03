package com.google.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {


	private Scanner sc;
	private ArrayList ar;

	public ListExInput() {
		sc = new Scanner(System.in);
		//ar = new ArrayList();
	}

	public ArrayList setInfo(ArrayList ar) {

		System.out.println("이름 입력");
		String name = sc.next();
		ar.add(name); //집어넣기

		System.out.println("번호 입력");
		int age = sc.nextInt();
		ar.add(age);
		
		return ar;
		
		
		
	}

}





