package com.simple.ifex;

import java.util.Scanner;

public class IfEX01 {

	public static void main(String[] args) {
		/*
		 * if���� ����ϱ�
		 * 
		 * 1. Ű����� ���̸� �Է� �޾� ���� ���θ� ��� ������ ������ 20�� �̻����� �Ѵ�.
		 * 
		 * 2. �̼����� ��� 10%����
		 * 
		 * 3. ���̿� ���� ���ɴ� ǥ�� 35��30��, 55��50�� 30~50������� ǥ��
		 * 
		 */

		int age;
		int pay = 10000;
		// ���࿡ �̼����̸� 10% �����ؼ� ����� ���

		// String ageOver20 = "����";
		String age20 = "�̼���";
		String agelevel = "����� �ƴմϴ�.";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("���̸� ������ �Է��ϼ���.");
		age = keyboard.nextInt();

		// ���̸� ���ؼ� ����/�̼��� ���� ���
		if (age >= 20) {
			age20 = "����";
		}

		// �̼��� ���ó��
		if (age < 20) {
			// �̼��� ��� 10%����
			pay = pay - (int) (pay * 0.1);
		}

		// 30��
		if (age >= 30) {
			if (age <= 39) {
				agelevel="30��";
			}
		}

		// 40��
		if (49 >= age && age >= 40) {
			agelevel="40��";
		}

		// 50��
		if (59 >= age && age >= 55 || 54 >= age && age >= 50) {
			agelevel="50��";
		}
		
		System.out.println("���ɴ� : "+agelevel);
		System.out.println("����/�̼��� : " + age20);
		System.out.println("���� : " + age + "��");
		System.out.println("��� : " + pay + "��");

		// else {
		// System.out.println(ageUnder20);
		// }

		// if(age<20) {
		// System.out.println(age20);
		// }

	}

}
