package com.simple.Loop;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {

		// �����԰� 40kg ���� �ɶ����� �ݺ��Ѵ�.
		// ������ �����Ը� Ű����� �Է��Ѵ�.
		// �Ϸ翡 �� kg�� �����Ѵ�.

		// 1. ���� ������ �Է�

		int weight = 54;
		final int TARGET_WEIGHT = 40;
		int num = 0;
		int count = 0;
		int quit = -1;

		Scanner kbd = new Scanner(System.in);
		System.out.println("���� ���?(10~50)");

		while (weight > TARGET_WEIGHT) {

//			if (num < 10 || num > 50) {
//				continue;
//			}

			do {
				num = kbd.nextInt();
			} while (num < 10 || num > 50);

			count++;
			weight = weight - (num / 10);

			System.out.println("���̾�Ʈ ����?(-1)");
			quit= kbd.nextInt();
			System.out.println("quit : " + quit);
			if (quit == -1) {
				break;
			}
		}

		System.out.println("���� ü�� : " + weight);
		System.out.println(count + " �ϸ��� ü�� ���� ");

	}

}
