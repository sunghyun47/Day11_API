package com.google.util.map;

import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("n1", 1);
		map.put("n2", 2);

		System.out.println(map.get("n1")); //n1 꺼내서 출력
		
		map.put("n1", 3); // 수정(같은키로 들어갈수는 있음)
		System.out.println(map.get("n1"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		for(int i=0; i<map.size(); i++) {
			System.out.println(map.get(i));
		}
		
	}

}
