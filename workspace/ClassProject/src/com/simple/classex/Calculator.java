package com.simple.classex;

public class Calculator {

	// 멤버 (속성, 데이터)
	int num1, num2, result = 0;
	double mok;

	public void showResult(String msg) {
		
		if (msg.equals("몫 : "))
			System.out.println(msg + mok);
		else
			System.out.println(msg + result);
	}

	// 덧셈 메서드 (기능)
	public int add(int num1, int num2) {
		result = num1 + num2;
		// System.out.println("합 : " + result);
		showResult("합 : ");
		return result;
	}
	
	// 덧셈2
	public double add(int num1, double num2) {
		double result = num1 + num2;
		// System.out.println("합 : " + result);
		showResult("합 : ");
		return result;
	}

	// 뺄셈 메서드 (기능)
	public int sub(int num1, int num2) {
		result = num1 - num2;
		// System.out.println("차 : " + result);
		showResult("차 : ");
		return result;
	}

	// 곱셈 메서드 (기능)
	public int mul(int num1, int num2) {
		result = num1 * num2;
		// System.out.println("곱 : " + result);
		showResult("곱 : ");
		return result;
	}

	// 나눗셈 메서드 (기능) 나눈셈은 소수점까지 나와야 하므로 더블!
	public double div(int num1, int num2) {
		mok = 0.0;

		if (num2 != 0) // 꼭 해줘야함
			mok = (double)num1 / num2; // 괄호 속 더블은 형변환
		else
			System.out.println("0으로 나눗셈 불가");

		showResult("몫 : ");
		// System.out.println("몫 : " + mok);
		return mok;
	}

	// 제곱 메서드 (기능)
	public int square(int num1) {
		result = num1 * num1;
		// System.out.println("제곱 : " + num1);
		showResult("제곱 : ");
		return result;
	}

}
