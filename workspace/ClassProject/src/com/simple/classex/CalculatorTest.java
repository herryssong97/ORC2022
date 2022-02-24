package com.simple.classex;

public class CalculatorTest {

	public static void main(String[] args) {

		// 객체생성 (계산기)
		Calculator calc1 = new Calculator();

		// 객체 사용 (덧셈)
		//int sum = calc1.add(5, 3);
		double sum = calc1.add(5, 3);
		// System.out.println("합 :" + sum);

		// 객체 사용 (뺄셈)
		sum = calc1.sub(10, 5);
		// System.out.println("차 :" + sum);

		// 객체 사용 (곱셈)
		sum = calc1.mul(7, 3);
		// System.out.println("곱 :" + sum);

		// 객체 사용 (나눗셈)
		double mok = calc1.div(33, 6);
		// System.out.println("몫 :" + mok);
		
		// 객체 사용 (제곱)
		sum = calc1.square(2);
		// System.out.println("제곱 :" + sum);

	}
}
