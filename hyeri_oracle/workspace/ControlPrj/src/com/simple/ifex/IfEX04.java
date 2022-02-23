package com.simple.ifex;

import java.util.Scanner;

public class IfEX04 {

	public static void main(String[] args) {
		/*
		 * switch문 사용하기
		 * 
		 * 1. 키보드로 나이를 입력 받아 성년 여부를 출력 성년의 기준은 20세 이상으로 한다.
		 * 
		 * 2. 미성년자 요금 10%할인
		 * 
		 * 3. 나이에 따른 연령대 표시
		 * 60대까지 표시한다.
		 * 10→10대 ...65→60대
		 * 
		 * 4. 60대부터 연금수령 연령대임을 표시
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
		
		// switch case
		// age /= 10; // 나이에 맞는 연령대 처리
		switch (age/10) {
		case 10:
		case 9:
		case 8:	
		case 7:
		case 6:
			agelevel = "연금수령 연령대";
			break;
		case 5:
			agelevel = "50대";
			break;
		case 4:
			agelevel = "40대";
			break;
		case 3:
			agelevel = "30대";
			break;
		case 2:
			agelevel = "20대";
			break;
		case 1:
			agelevel = "10대";
			break;
	
				
		default:
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
