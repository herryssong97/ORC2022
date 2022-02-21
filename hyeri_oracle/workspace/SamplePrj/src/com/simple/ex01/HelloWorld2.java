package com.simple.ex01;

public class HelloWorld2 {

	public static void main(String[] args) {
		// 데이터 선언 (데이터 준비)
		/*
		 이름, 나이, 키, 몸무게, 성별 (남M/여F), 지역(서울)
		 개인정보를 입력하여 출력호세요.
		*/
		String name;
		int age, height, weight;
		
		boolean gender = false;
		// System.out.println("성별 : " + gender);
		// char gender1 = '여'; // 남자는 0M 여자는 1F
		//char gender1 = '여';
		if(true) {
			System.out.println("여");
		}
		if(false) {
			System.out.println("남");
		}
		
		
		
		String city;
		char city1;
		
		name = "송혜리";
		System.out.println(name);
		
		age = 26;
		System.out.println(age);
		
		height = 163;
		System.out.println(height);
		
		weight = 53;
		System.out.println(weight);
		

		// gender1 = 10 == 10;
		// System.out.println("gender : " gender1);
		
		city = "서울시 관악구";
		System.out.println(city);
		
		
		
		
		
	}

}
