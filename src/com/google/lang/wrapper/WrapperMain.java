package com.google.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {

		//Wrapper_ex1 we = new Wrapper_ex1();
		//we.ex1();
		//we.ex2();
		Wrapper_ex3 we = new Wrapper_ex3();
		we.ex1();
		
		//int num = 10;
		//System.out.println(Integer.toBinaryString(num));
		
		Integer n1 = new Integer(10); //n1에 주소값
		
		int num = n1.intValue(); 
		num = n1; //autoUnBoxing(같은 타입끼리만 가능)
		n1 = 20; //autoBoxing(heap->stack)
		
		n1 = (int)20.3; 
		Double d = 20.3;
		
		String s1 = "iu";
		String s2 = "cccc";
		System.out.println(s1.hashCode()); //3372 출력
		
		s1 = s1+s2;
		System.out.println(s1.hashCode()); // -1177806868 출력
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.hashCode()); //366712642 출력
		s.append("AA");
		System.out.println(s.hashCode()); //366712642 출력
		s.append("BB");
		
		System.out.println(s.toString()); // AABB 출력
		String names = s.toString();
		
		double d1 = 3.14;
		d1 = Math.ceil(d1); //올림
		System.out.println(d1); // 4.0 출력
		
		d1 = 3.44;
		d1 = Math.floor(d1); //내림
		System.out.println(d1); // 3.0 출력
		
		d1 = 3.54;
		d1 = Math.round(d1); //반올림
		System.out.println(d1); // 4.0 출력
		
		d1 = Math.random(); //랜덤
		System.out.println(d1); // 출력값 계속바낌
		
		
		
		
		
	}

}
