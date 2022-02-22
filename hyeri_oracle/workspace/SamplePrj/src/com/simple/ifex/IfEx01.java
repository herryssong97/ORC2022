package com.simple.ifex;

import java.util.Scanner;

public class IfEX01 {

	public static void main(String[] args) {
		/*
		 * if문만 사용하기
		 * 
		 * 1. 키보드로 나이를 입력 받아 성년 여부를 출력 성년의 기준은 20세 이상으로 한다.
		 * 
		 * 2. 미성년자 요금 10%할인
		 * 
		 * 3. 나이에 따른 연령대 표시 35→30대, 55→50대 30~50대까지만 표시
		 * 
		 */

		int age;
		int pay = 10000;
		// 만약에 미성년이면 10% 할인해서 요금을 계산

		// String ageOver20 = "성년";
		String age20 = "미성년";
		String agelevel = "대상이 아닙니다.";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("나이를 정수로 입력하세요.");
		age = keyboard.nextInt();

		// 나이를 비교해서 성년/미성년 여부 출력
		if (age >= 20) {
			age20 = "성년";
		}

		// 미성년 요금처리
		if (age < 20) {
			// 미성년 요금 10%할인
			pay = pay - (int) (pay * 0.1);
		}

		// 30대
		if (age >= 30) {
			if (age <= 39) {
				agelevel="30대";
			}
		}

		// 40대
		if (49 >= age && age >= 40) {
			agelevel="40대";
		}

		// 50대
		if (59 >= age && age >= 55 || 54 >= age && age >= 50) {
			agelevel="50대";
		}
		
		System.out.println("연령대 : "+agelevel);
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
