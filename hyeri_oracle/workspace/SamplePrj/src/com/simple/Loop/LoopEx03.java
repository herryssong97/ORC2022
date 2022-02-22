package com.simple.Loop;

import java.util.Scanner;

public class LoopEx03 {

	public static void main(String[] args) {

		// 키보드로 입력된 숫자만큼 반복하여
		// 키보드로 입력한 숫자까지의 합을 구하시오.
		// 1부터 n까지의 합

		int n = 0;
		long sumEven = 0;
		long sumOdd = 0;
		long sum = 0;

		// 키보드 입력
		Scanner kbd = new Scanner(System.in);
		System.out.println("1~n까지의 합을 구하고자 하는 값");
		n = kbd.nextInt(); // => 숫자만

		for (int i = 1; i <= n; i++) {
			// 짝수의 합을 구하시오.
			if (i % 2 != 0) {
				sumEven += i;
				System.out.println(" +" + i);
			} else { // 홀수의 합을 구하시오
				sumOdd += i;
			}
		}

		
		sum = sumEven + sumOdd;
		System.out.println("짝수합 : " + sumEven);
		System.out.println("홀수합 : " + sumOdd);

		System.out.println("1~n 합 : " + sumEven + sumOdd);

	}

}
