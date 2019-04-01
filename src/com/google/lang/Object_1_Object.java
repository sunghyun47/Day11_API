package com.google.lang;

public class Object_1_Object {

	public static void main(String[] args) {

		//object 클래스 객체생성
		//클래스명 참조변수명 = new 생성자();
		//참조변수명.멤버변수명
		//참조변수명.멤버메서드명() //메서드호출
		Object obj = new Object();
		Object obj2 = new Object();
		
		//메서드 선언하는 공식
		//접근지정자 그외지정자 리턴타입 메서드명([매개변수선언])

		boolean c = obj.equals(obj2);
		System.out.println(c);
		
		String s = obj.toString();
		System.out.println(s);
		
		int h = obj.hashCode();
		System.out.println(h);
		
		String ss = "hello world";
		int n = ss.indexOf("l",0);
		// int n = ss.indexOf('h'); //h의 인덱스번호를 반환
		System.out.println("n : " + n);
		
		ss = "hello world";
		String r = ss.substring(7); //7번째부터 출력
		System.out.println(r);
		r = ss.substring(3,6);
		System.out.println(r);
		System.out.println("==============");
		
		r = ss.toUpperCase(); //대문자로 변환
		System.out.println(r);
		
		r = ss.toLowerCase(); //소문자로 변환
		System.out.println(r);
		System.out.println("==============");
		
		
		String str1 = "test";
		String str2 = " test ";
		r = str2.trim();
		System.out.println(str2);
		System.out.println(r);
		System.out.println("==============");
		
		r = String.valueOf(3);
		System.out.println(r); // 3 출력
		System.out.println("=============="); 
		
		ss = "aa-bb-cc-dd";
		String [] names = ss.split("-"); // - 기준으로
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]); // aa bb cc dd 출력
		}
		System.out.println("==============");
		
		ss = "a,b,c-d-e-f";
		r= ss.replace('-',','); // -표시를 ,로 바꿔줌
		System.out.println(r);
		System.out.println("==============");
		
		
		
		
		
		
		
		
		
	}

}
