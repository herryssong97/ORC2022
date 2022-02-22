package com.simple.Loop;

import java.util.Scanner;

public class LoopEx05 {

	public static void main(String[] args) {

		// 임의의 수를 생성하여
		// 그 합을 구한다.
		int rand;
		int sum = 0;
		double avg = 0.0;
		int max = 0; // 최고점수 구하기. 초기에 꼭 최소값을 넣어줘야한다 최소값중-가 있을수도 있으니 주의해야 한다.
		int min = 100; // 최소성적. 반대로 최고 점수를 적어줘야 한다.
		String hakjum = "";
		final int NUM = 20;

		// 난수 사용
		for (int i = 0; i < NUM; i++) {

			// 성적점수 1~100을 생성한다.
			rand = (int) (Math.random() * 100) + 30; // 0 포함하여 131보다 작은 수가 랜덤으로 보이게 (0~100)
			if (rand >= 100)
				rand = 95;

//			if(i==0) {
//				max = rand;
//			}

			// 최고성적
			if (max < rand) {
				max = rand;
			}

			// 최저성적
			if (min > rand) {
				min = rand;
			}

			System.out.print(rand + " ");
			sum += rand;
		}

		avg = (double) sum / NUM; // 평균

		// 학점을 출력하시오
		// 평균 80이상 A학점
		// 평균 60이상 B학점
		// 평균 60미만 C학점

		// if, else if

		if (avg >= 80) {
			hakjum = "A";
		}

		if (avg >= 60) {
			hakjum = "B";
		}

		if (avg < 60) {
			hakjum = "C";
		}

		System.out.printf("\n성적평균 :%6.3f", avg);
		// 위 %f 는 실수 avg를 보여줌
		System.out.println("\n최고성적 : " + max);
		System.out.println("최저성적 : " + min);
		System.out.println("평균학점 : " + hakjum);
	}

}
