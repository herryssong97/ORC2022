package com.simple.Loop;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {

		// 반평성
		// 3반까지 편성가능!
		int rand = 0;
		String Ban = ""; // 3개의 반으로 편성
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		// 난수 사용
		for (int i = 0; i < 10; i++) {
			rand = (int) (Math.random() * (100 - 50 + 1)) + 50;

			if (rand % 3 == 0) {
				Ban = "A반";
				aCount++;
			} else if (rand % 3 == 1) {
				Ban = "B반";
				bCount++;
			} else {
				Ban = "C반";
				cCount++;
			}

			System.out.printf("%d : %s \n", rand, Ban);
		}

		System.out.println("전체 A반 : " + aCount + "명");
		System.out.println("전체 B반 : " + bCount + "명");
		System.out.println("전체 C반 : " + cCount + "명");
	}

}