package com.simple.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 5���� ����, ����, ���� ������ ������ ������ �غ��Ͻÿ�.
		// ���� ��� ���Ͻÿ�. (�� �Ҽ��� ���ڸ� ���� ǥ��)
		// int[][] jumsu = new int[5][3]; // �迭 ����
		
		int[][] score = {
				{45,67,78,0},
				{90,80,70,0},
				{77,87,67,0},
				{30,40,50,0},
				{45,56,67,0}
		};
		
		int tot[] = new int[3];
		double[] avg = new double[3]; // ���
		
		int jumsu = 0;
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(" >>  ��  ��  ǥ    << ");
		System.out.println("���� ���� ����  ����");
		
		for (int i = 0; i < score.length; i++) {			
			for (int j = 0; j < score[0].length-1; j++) {
				jumsu = score[i][j];
				// System.out.printf("%2d,",jumsu);
				tot[j] = tot[j]+jumsu;
				// System.out.println(tot[j]);
				System.out.printf("%3d,",jumsu);
			}
			System.out.println(); // ��� �� ���缭 ��Ÿ���� �ϱ� (for�� �ٱ��� ����� ��)
			System.out.println("------------");
		}
		
		// ���� ��� ���ϱ�
		for (int i = 0; i < avg.length; i++) {
			avg[i] = (double)tot[i] / score.length;
		}
		System.out.println("============");
		System.out.printf("������� : %.2f \n",  avg[0]);
		System.out.printf("������� : %.2f \n",  avg[1]);
		System.out.printf("������� : %.2f \n", avg[2]);
		
	}

}
