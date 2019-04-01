package com.google.string.ex1;

public class WeatherMain {

	public static void main(String[] args) {

		WeatherInit wi = new WeatherInit();
		Weather [] weathers = wi.getWeathers();
		
		for(int i=0; i<weathers.length; i++) {
			
			System.out.println("도시명 : " + weathers[i].getCity());
			System.out.println("상태 : " + weathers[i].getState());
			
		}
		
		
		
		
	}

}
