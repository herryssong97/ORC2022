package com.simple.Loop;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {

		// ����
		// 3�ݱ��� ������!
		int rand = 0;
		String Ban = ""; // 3���� ������ ��
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		// ���� ���
		for (int i = 0; i < 10; i++) {
			rand = (int) (Math.random() * (100 - 50 + 1)) + 50;

			if (rand % 3 == 0) {
				Ban = "A��";
				aCount++;
			} else if (rand % 3 == 1) {
				Ban = "B��";
				bCount++;
			} else {
				Ban = "C��";
				cCount++;
			}

			System.out.printf("%d : %s \n", rand, Ban);
		}

		System.out.println("��ü A�� : " + aCount + "��");
		System.out.println("��ü B�� : " + bCount + "��");
		System.out.println("��ü C�� : " + cCount + "��");
	}

}