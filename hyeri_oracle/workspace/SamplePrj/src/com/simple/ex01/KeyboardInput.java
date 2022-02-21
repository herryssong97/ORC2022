package com.simple.ex01;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {

		// 키보드 입력
		// 1. 키보드 입력을 담당할 객체 생성
		// 2. 생성된 객체를 이용

		// 키보드 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		// 입력 데이터 맞는 변수 준비해서 데이터를 받음
		System.out.println("정수 값(10~20)을 입력하세요 :");
		String input = keyboard.nextLine(); // => 문자도 가능
		// int input = keyboard.nextInt(); // => 숫자만

		
		System.out.println("입력 값 :" +input);
		System.out.println("입력 값 :" +(input+100));
		// 하단 콘솔창에 숫자를 입력해주고 엔터해준다
		
		
		
	}

}
