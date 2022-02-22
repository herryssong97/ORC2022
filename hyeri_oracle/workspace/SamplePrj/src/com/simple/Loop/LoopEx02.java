package com.simple.Loop;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {

		// 몸무게가 40kg 이하 될때까지 반복한다.
		// 현재의 몸무게를 키보드로 입력한다.
		// 하루에 몇 kg씩 감량한다.

		// 1. 현재 몸무게 입력

		int weight = 54;
		final int TARGET_WEIGHT = 40;
		int num = 0;
		int count = 0;
		int quit = -1;

		Scanner kbd = new Scanner(System.in);
		System.out.println("오늘 운동량?(10~50)");

		while (weight > TARGET_WEIGHT) {

//			if (num < 10 || num > 50) {
//				continue;
//			}

			do {
				num = kbd.nextInt();
			} while (num < 10 || num > 50);

			count++;
			weight = weight - (num / 10);

			System.out.println("다이어트 포기?(-1)");
			quit= kbd.nextInt();
			System.out.println("quit : " + quit);
			if (quit == -1) {
				break;
			}
		}

		System.out.println("현재 체중 : " + weight);
		System.out.println(count + " 일만에 체중 감량 ");

	}

}
