package com.simple.classex;

public class CalculatorTest {

	public static void main(String[] args) {

		// ��ü���� (����)
		Calculator calc1 = new Calculator();

		// ��ü ��� (����)
		int sum = calc1.add(5, 3);
		// System.out.println("�� :" + sum);

		// ��ü ��� (����)
		sum = calc1.sub(10, 5);
		// System.out.println("�� :" + sum);

		// ��ü ��� (����)
		sum = calc1.mul(7, 3);
		// System.out.println("�� :" + sum);

		// ��ü ��� (������)
		double mok = calc1.div(33, 6);
		// System.out.println("�� :" + mok);
		
		// ��ü ��� (����)
		sum = calc1.square(2);
		// System.out.println("���� :" + sum);

	}
}
