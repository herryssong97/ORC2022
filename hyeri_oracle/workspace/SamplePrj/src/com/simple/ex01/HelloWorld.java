package com.simple.ex01;

public class HelloWorld {

	public static void main(String[] args) {
		// 데이터 선언 (데이터 준비)
		// 정수
		int a;
		short a1;
		byte a2;
		
		// 실수
		float b1;
		double b2;
		
		char ch1;
		boolean d1;
		
		String name = "";
		
		name="홍길동";
		ch1 = '동';
		
		a = 2133444;
		a1 = 234; a2 = -128;
		System.out.println("a1 → " +a1); // 값 : 234
		
		
		// b1 = 132.45f;
		b1 = (float) 132.45; // 형변환
		b2 = 132.45;
		
		d1 = false;
		System.out.println("d1 : "+d1); // 값 : false
		
		d1 = 10 == 10; // 같은지 비교
		System.out.println("d1 : "+d1); // 값 : true
		
		
		// 이름, 나이, 키, 몸무게, 성별, 지역
		String N1 = "";
		N1 = "송혜리";
		
		short age;
		age = 26;
		
		short cm; 
		cm = 163;
		
		short kg;
		kg = 53;
		
		String where;
		where = "서울시";
		
		System.out.println(N1);
		System.out.println(age);
		System.out.println(cm);
		System.out.println(kg);
		System.out.println(where);
	}

}











