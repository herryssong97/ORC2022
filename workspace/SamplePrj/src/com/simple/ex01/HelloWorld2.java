package com.simple.ex01;

public class HelloWorld2 {

	public static void main(String[] args) {
		// ������ ���� (������ �غ�)
		/*
		 * �̸�, ����, Ű, ������, ���� (��M/��F), ����(����) ���������� �Է��Ͽ� ����ϼ���.
		 */
		String name;
		int age, height, weight;

		boolean gender = true;
		// System.out.println("���� : " + gender);
		// char gender1 = '��'; // ���ڴ� 0M ���ڴ� 1F
		// char gender1 = '��';
		if (gender) {
			System.out.println("���� : ��");
		} else {
			System.out.println("���� : ��");
		}

		// System.out.println(gender);

		String city;
		char city1;

		name = "������";
		System.out.println("�̸� : " + name);

		age = 26;
		System.out.println("���� : " + age + "��");

		height = 163;
		System.out.println("Ű : " + height + "cm");

		weight = 53;
		System.out.println("������ : " + weight + "kg");

		city = "����� ���Ǳ�";
		System.out.println(city);

	}

}
