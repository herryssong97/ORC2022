package com.simple.ex;
/*[문제3] 급여명세서를 작성하시오

  조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%

  조건2) 실수령액 = 기본급 + 시간수당 - 세금



--출력--

실수령액 : 1405000원


*/

public class practice03 {

	public static void main(String[] args) {

		int normal = 1500000; // 기본급
		int time = 55000;		// 수당
		double tax = normal * 0.01;	// 세금 = 기본급의 10%
		// System.out.println("기본급 + 시간수당 = " + (normal + time));
		double money ; // 실수령액
		
		money = (normal + time) - tax;
		System.out.println("실수령액 = " + money);
		
		
		
	}
}
