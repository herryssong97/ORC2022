package com.simple.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 5명의 국어, 영어, 수학 점수를 저장할 공간을 준비하시오.
		// 과목별 평균 구하시오. (단 소수점 두자리 까지 표기)
		// int[][] jumsu = new int[5][3]; // 배열 선언
		
		int[][] score = {
				{45,67,78,0},
				{90,80,70,0},
				{77,87,67,0},
				{30,40,50,0},
				{45,56,67,0}
		};
		
		int tot[] = new int[3];
		double[] avg = new double[3]; // 평균
		
		int jumsu = 0;
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(" >>  성  적  표    << ");
		System.out.println("국어 영어 수학  총점");
		
		for (int i = 0; i < score.length; i++) {			
			for (int j = 0; j < score[0].length-1; j++) {
				jumsu = score[i][j];
				// System.out.printf("%2d,",jumsu);
				tot[j] = tot[j]+jumsu;
				// System.out.println(tot[j]);
				System.out.printf("%3d,",jumsu);
			}
			System.out.println(); // 행과 열 맞춰서 나타나게 하기 (for문 바깥에 적어야 함)
			System.out.println("------------");
		}
		
		// 과목별 평균 구하기
		for (int i = 0; i < avg.length; i++) {
			avg[i] = (double)tot[i] / score.length;
		}
		System.out.println("============");
		System.out.printf("국어평균 : %.2f \n",  avg[0]);
		System.out.printf("영어평균 : %.2f \n",  avg[1]);
		System.out.printf("수학평균 : %.2f \n", avg[2]);
		
	}

}
