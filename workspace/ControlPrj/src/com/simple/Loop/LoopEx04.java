package com.simple.Loop;

import java.util.Scanner;

public class LoopEx04 {

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
		System.out.println("합이 100 이상일 때 까지의 n을" + "구하시오.");
		// n = kbd.nextInt(); // => 숫자만
		int i = 0;
		while (true) {
			sum += i;
			System.out.println("sum: " + sum);
			if (sum >= 100) {
				System.out.println(" " + i);
				break;
			}
			i++;
		}

	}

}
