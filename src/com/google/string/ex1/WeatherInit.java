package com.google.string.ex1;

public class WeatherInit {

	private String info; //변수

	public WeatherInit() {//생성자
		info = "seoul, 맑음, 10, 20, 0.3, daejon, 비, -22, 50, 0.1,"
				+ "incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";

	}

	public Weather[] getWeathers() {

		//seoul, 맑음, 10, 20, 0.3 -> 0,1,2,3,4
		//daejon, 비, -22, 50, 0.1 -> 5,6,7,8,9 등등 이런식으로
		String [] ar = info.split(","); //, 별로 따로 가지고 들어와야됨
		Weather [] weathers = new Weather[ar.length/5]; //총 4개 지역 담을수있는 배열 선언

		//첫번째방법
		int index=0;
		for(int i=0; i<weathers.length; i++) {
			Weather w = new Weather(); //for문 돌면서 4번 만들어짐
			w.setCity(ar[i]); //0,5,10,15
			w.setState(ar[++i]); //1,6,11,16
			w.setTem(ar[++i]); //2,7,12,17
			w.setHum(ar[++i]); //3,8,13,18
			w.setMise(ar[++i]); //4,9,14,19
			weathers[index] = w;
			index++;
		}
		
		//두번째방법
		index = 0;
		for(int i=0; i<weathers.length; i=i+5) {
			Weather w = new Weather(); //for문 돌면서 4번 만들어짐
			w.setCity(ar[i]); //0,5,10,15
			w.setState(ar[i+1]); //1,6,11,16
			w.setTem(ar[i+2]); //2,7,12,17
			w.setHum(ar[i+3]); //3,8,13,18
			w.setMise(ar[i+4]); //4,9,14,19
			weathers[i] = w;
			index++;

		} 
		
		return weathers;
		
		
	}



}
