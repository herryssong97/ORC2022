package com.simple.Loop;

import java.util.Scanner;

public class LoopEx03 {

	public static void main(String[] args) {

		// Ű����� �Էµ� ���ڸ�ŭ �ݺ��Ͽ�
		// Ű����� �Է��� ���ڱ����� ���� ���Ͻÿ�.
		// 1���� n������ ��

		int n = 0;
		long sumEven = 0;
		long sumOdd = 0;
		long sum = 0;

		// Ű���� �Է�
		Scanner kbd = new Scanner(System.in);
		System.out.println("1~n������ ���� ���ϰ��� �ϴ� ��");
		n = kbd.nextInt(); // => ���ڸ�

		for (int i = 1; i <= n; i++) {
			// ¦���� ���� ���Ͻÿ�.
			if (i % 2 != 0) {
				sumEven += i;
				System.out.println(" +" + i);
			} else { // Ȧ���� ���� ���Ͻÿ�
				sumOdd += i;
			}
		}

		
		sum = sumEven + sumOdd;
		System.out.println("¦���� : " + sumEven);
		System.out.println("Ȧ���� : " + sumOdd);

		System.out.println("1~n �� : " + sumEven + sumOdd);

	}

}
