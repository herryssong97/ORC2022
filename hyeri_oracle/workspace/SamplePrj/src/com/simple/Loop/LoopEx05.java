package com.simple.Loop;

import java.util.Scanner;

public class LoopEx05 {

	public static void main(String[] args) {

		// ������ ���� �����Ͽ�
		// �� ���� ���Ѵ�.
		int rand;
		int sum = 0;
		double avg = 0.0;
		int max = 0; // �ְ����� ���ϱ�. �ʱ⿡ �� �ּҰ��� �־�����Ѵ� �ּҰ���-�� �������� ������ �����ؾ� �Ѵ�.
		int min = 100; // �ּҼ���. �ݴ�� �ְ� ������ ������� �Ѵ�.
		String hakjum = "";
		final int NUM = 20;

		// ���� ���
		for (int i = 0; i < NUM; i++) {

			// �������� 1~100�� �����Ѵ�.
			rand = (int) (Math.random() * 100) + 30; // 0 �����Ͽ� 131���� ���� ���� �������� ���̰� (0~100)
			if (rand >= 100)
				rand = 95;

//			if(i==0) {
//				max = rand;
//			}

			// �ְ���
			if (max < rand) {
				max = rand;
			}

			// ��������
			if (min > rand) {
				min = rand;
			}

			System.out.print(rand + " ");
			sum += rand;
		}

		avg = (double) sum / NUM; // ���

		// ������ ����Ͻÿ�
		// ��� 80�̻� A����
		// ��� 60�̻� B����
		// ��� 60�̸� C����

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

		System.out.printf("\n������� :%6.3f", avg);
		// �� %f �� �Ǽ� avg�� ������
		System.out.println("\n�ְ��� : " + max);
		System.out.println("�������� : " + min);
		System.out.println("������� : " + hakjum);
	}

}
