package com.simple.ex01;

public class TypeCastingEx {

	public static void main(String[] args) {

		// ����ȯ
		// 1. �������� ��Ȯ�� ���
		// 2. ��ü���⿡�� ������ �ٷ�� �Ҷ�

		int a = 5;
		int b = 2;

		int sum;
		double tot, tot1, tot2;

		tot1 = a / 3.0; // .�� ���̸� ���������� �Ǽ��� �ٲ�
		tot2 = a / 3;
		System.out.println(tot1);
		System.out.println(tot2); // �������迡���� �Ǽ��� �������� �ʱ� ������ �Ҽ����� ����

		// sum = a / b;
		tot = (double) a / b; // �Ҽ��� �ڸ��� �ʿ��ϸ� (double)�� �� �Է��������
		sum = (int) tot;
		System.out.println("��:" + sum);
		System.out.println("��:" + tot); 

	}

}
