package com.simple.ifex;

import java.util.Scanner;

public class IfEX03 {

	public static void main(String[] args) {
		/*
		 * if/else�� ����ϱ�
		 * 
		 * 1. Ű����� ���̸� �Է� �޾� ���� ���θ� ��� ������ ������ 20�� �̻����� �Ѵ�.
		 * 
		 * 2. �̼����� ��� 10%����
		 * 
		 * 3. ���̿� ���� ���ɴ� ǥ��
		 * ��� ���ɴ븦 ǥ���Ѵ�.
		 * 10��10�� ...35��30��.. 100��100��
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


		if(age>=100) {
			agelevel = "100��";
		}else if(age>=90){
			agelevel = "90��";
		}else if(age>=80){
			agelevel = "80��";
		}else if(age>=70){
			agelevel = "70��";
		}else if(age>=60){
			agelevel = "60��";
		}else if(age>=50){
			agelevel = "50��";
		}else if(age>=40){
			agelevel = "40��";
		}else if(age>=30){
			agelevel = "30��";
		}else if(age>=20){
			agelevel = "20��";
		}else if(age>=10){
			agelevel = "10��";
		}else if(age>10){
			agelevel = "�����оƵ�";
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
