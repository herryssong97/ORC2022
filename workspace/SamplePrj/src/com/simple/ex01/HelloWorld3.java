package com.simple.ex01;
		// 상수
public class HelloWorld3 {
		
	public static void main(String[] args) {
		// 변수를 final로 지정하면 값을 바꾸지 못한다
		final int NUM = 1; // 대문자 : 상수 = 변하지 않거나 일정한 값을 가진 수나 양을 의미
		// System.out.println(NUM);
		
		int a = 10;
		
		// num = 10; 위에 final 때문에 변경이 안됨 
		
		a = a-NUM; // 누적수식 (먼저 =뒤에 있는 a+NUM을 계산하여 맨 앞의 a의 값이 나온다)
		System.out.println("a : " +a);
		
		// a = a-NUM; // 바로 위의 계산에서 나온 a의 값에서 동일한 방법으로 다시 계산이 된다
		// System.out.println(a+10+ ": a값");
		
		a = a-NUM;
		System.out.println("a값 : " +(a+10));// "문자열"이 먼저 나오면 뒤 내용이 문자로 인식되어 줄줄 붙여서 나옴, 꼭 괄호를 적어줘야 함
		System.out.println(a+10+": a값");
	}

}
