package com.google.lang.wrapper;

public class Wrapper_ex3 {
	public static void main(String[] args) {

		new Wrapper_ex3().ex1();
	}
	public void ex1() {

		//random 발생
		//0~9사이 정수 반환
		double r = Math.random(); //0.0~1.0미만
		int result = (int)(r*10);
		System.out.println(result);

	}

}
