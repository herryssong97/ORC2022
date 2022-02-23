package com.simple.ifex;

import java.util.Scanner;

public class IfEX05 {

	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력 받아서 그 수가 짝수인지 홀수인지 판별하시오
		 * 
		 * 2. 어떤 수가 3의 배수인지 판별하시오
		 * 
		 */

		int num = 0;
		String isEvenOdd = "짝수";
		
		final int MULTI = 4; // 상수 *변하지 않는 값, 대문자로 꼭 써주기
		String multi = MULTI + "의배수";

		/* 짝수 */
		// 키보드 객체 생성
		Scanner keyboard = new Scanner(System.in);

		// 입력 데이터 맞는 변수 준비해서 데이터를 받음
		System.out.println("정수로 입력 : ");
		num = keyboard.nextInt(); // => 숫자만

		if (num % 2 != 0) {
			isEvenOdd = "홀수";
		}
		System.out.printf("입력값 : %d, %s \n", num, isEvenOdd);
		// %d = 10진수(변수인 num) / %s = 문자열(변수인 isEvenOdd)

		/* 3의 배수 */
		System.out.println("정수로 입력 : ");
		num = keyboard.nextInt(); // => 숫자만

		if (num % MULTI != 0) {
			multi = MULTI + "의 배수가 아니다.";
		}

		System.out.printf("입력값 : %d, %s", num, multi);

	}

}
