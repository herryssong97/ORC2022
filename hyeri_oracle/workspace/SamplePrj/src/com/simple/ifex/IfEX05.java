package com.simple.ifex;

import java.util.Scanner;

public class IfEX05 {

	public static void main(String[] args) {
		/*
		 * 1. ������ �Է� �޾Ƽ� �� ���� ¦������ Ȧ������ �Ǻ��Ͻÿ�
		 * 
		 * 2. � ���� 3�� ������� �Ǻ��Ͻÿ�
		 * 
		 */

		int num = 0;
		String isEvenOdd = "¦��";
		
		final int MULTI = 4; // ��� *������ �ʴ� ��, �빮�ڷ� �� ���ֱ�
		String multi = MULTI + "�ǹ��";

		/* ¦�� */
		// Ű���� ��ü ����
		Scanner keyboard = new Scanner(System.in);

		// �Է� ������ �´� ���� �غ��ؼ� �����͸� ����
		System.out.println("������ �Է� : ");
		num = keyboard.nextInt(); // => ���ڸ�

		if (num % 2 != 0) {
			isEvenOdd = "Ȧ��";
		}
		System.out.printf("�Է°� : %d, %s \n", num, isEvenOdd);
		// %d = 10����(������ num) / %s = ���ڿ�(������ isEvenOdd)

		/* 3�� ��� */
		System.out.println("������ �Է� : ");
		num = keyboard.nextInt(); // => ���ڸ�

		if (num % MULTI != 0) {
			multi = MULTI + "�� ����� �ƴϴ�.";
		}

		System.out.printf("�Է°� : %d, %s", num, multi);

	}

}
