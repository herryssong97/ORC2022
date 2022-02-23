package com.simple.ifex;

import java.util.Scanner;

public class IfEX03 {

	public static void main(String[] args) {
		/*
		 * if/else문 사용하기
		 * 
		 * 1. 키보드로 나이를 입력 받아 성년 여부를 출력 성년의 기준은 20세 이상으로 한다.
		 * 
		 * 2. 미성년자 요금 10%할인
		 * 
		 * 3. 나이에 따른 연령대 표시
		 * 모든 연령대를 표시한다.
		 * 10→10대 ...35→30대.. 100→100대
		 * 
		 */

		int age;
		int pay = 10000;
		// 만약에 미성년이면 10% 할인해서 요금을 계산
		// 성년은 + 1000원이 추가된다.

		// String ageOver20 = "성년";
		String age20 = "미성년";
		String agelevel = "미취학아동";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("나이를 정수로 입력하세요.");
		age = keyboard.nextInt();

		// 나이를 비교해서 성년/미성년 여부 출력
		if (age >= 20) {
			age20 = "성년";
		} else {
			age20 = "미성년";
		}

		// 미성년 요금처리
		if (age < 20) {
			// 미성년 요금 10%할인
			pay = pay - (int) (pay * 0.1);
		} else {
			// 성년은 +1000원 추가한다.
			// pay = pay + 1000;
			pay += 1000;
		}


		if(age>=100) {
			agelevel = "100대";
		}else if(age>=90){
			agelevel = "90대";
		}else if(age>=80){
			agelevel = "80대";
		}else if(age>=70){
			agelevel = "70대";
		}else if(age>=60){
			agelevel = "60대";
		}else if(age>=50){
			agelevel = "50대";
		}else if(age>=40){
			agelevel = "40대";
		}else if(age>=30){
			agelevel = "30대";
		}else if(age>=20){
			agelevel = "20대";
		}else if(age>=10){
			agelevel = "10대";
		}else if(age>10){
			agelevel = "미취학아동";
		}
		
		
		
		System.out.println("연령대 : " + agelevel);
		System.out.println("성년/미성년 : " + age20);
		System.out.println("나이 : " + age + "세");
		System.out.println("요금 : " + pay + "원");

		// else {
		// System.out.println(ageUnder20);
		// }

		// if(age<20) {
		// System.out.println(age20);
		// }

	}

}
