package com.simple.ifex;

import java.util.Scanner;

public class IfEX04 {

	public static void main(String[] args) {
		/*
		 * switch�� ����ϱ�
		 * 
		 * 1. Ű����� ���̸� �Է� �޾� ���� ���θ� ��� ������ ������ 20�� �̻����� �Ѵ�.
		 * 
		 * 2. �̼����� ��� 10%����
		 * 
		 * 3. ���̿� ���� ���ɴ� ǥ��
		 * 60����� ǥ���Ѵ�.
		 * 10��10�� ...65��60��
		 * 
		 * 4. 60����� ���ݼ��� ���ɴ����� ǥ��
		 * 
		 */

		int age;
		int pay = 10000;
		// ���࿡ �̼����̸� 10% �����ؼ� ����� ���
		// ������ + 1000���� �߰��ȴ�.

		// String ageOver20 = "����";
		String age20 = "�̼���";
		String agelevel = "�����оƵ�";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("���̸� ������ �Է��ϼ���.");
		age = keyboard.nextInt();

		// ���̸� ���ؼ� ����/�̼��� ���� ���
		if (age >= 20) {
			age20 = "����";
		} else {
			age20 = "�̼���";
		}

		// �̼��� ���ó��
		if (age < 20) {
			// �̼��� ��� 10%����
			pay = pay - (int) (pay * 0.1);
		} else {
			// ������ +1000�� �߰��Ѵ�.
			// pay = pay + 1000;
			pay += 1000;
		}
		
		// switch case
		// age /= 10; // ���̿� �´� ���ɴ� ó��
		switch (age/10) {
		case 10:
		case 9:
		case 8:	
		case 7:
		case 6:
			agelevel = "���ݼ��� ���ɴ�";
			break;
		case 5:
			agelevel = "50��";
			break;
		case 4:
			agelevel = "40��";
			break;
		case 3:
			agelevel = "30��";
			break;
		case 2:
			agelevel = "20��";
			break;
		case 1:
			agelevel = "10��";
			break;
	
				
		default:
		}
		
		System.out.println("���ɴ� : " + agelevel);
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
