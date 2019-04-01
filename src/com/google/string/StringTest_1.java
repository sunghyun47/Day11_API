package com.google.string;

public class StringTest_1 {

	public static void main(String[] args) {

		// System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String s1 = "IU";
		String s2 = "IU";
		String s3 = new String("IU");
		String s4 = new String("IU");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		String str = "abc";
		char ch = str.charAt(1);
		System.out.println(ch);
		
		StringEx_1 se = new StringEx_1();
		se.ex1();
		
		
		str = "BBB";
		int l = str.length(); //isEmpty
		System.out.println(l);
		
		
		
		
		
	}

}
