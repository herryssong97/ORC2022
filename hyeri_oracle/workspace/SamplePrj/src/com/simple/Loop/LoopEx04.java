package com.simple.Loop;

import java.util.Scanner;

public class LoopEx04 {

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
		System.out.println("���� 100 �̻��� �� ������ n��" + "���Ͻÿ�.");
		// n = kbd.nextInt(); // => ���ڸ�
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
