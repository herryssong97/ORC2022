package com.simple.classex;

public class Calculator {

	// ��� (�Ӽ�, ������)
	int num1, num2, result = 0;
	double mok;

	public void showResult(String msg) {
		
		if (msg.equals("�� : "))
			System.out.println(msg + mok);
		else
			System.out.println(msg + result);
	}

	// ���� �޼��� (���)
	public int add(int num1, int num2) {
		result = num1 + num2;
		// System.out.println("�� : " + result);
		showResult("�� : ");
		return result;
	}

	// ���� �޼��� (���)
	public int sub(int num1, int num2) {
		result = num1 - num2;
		// System.out.println("�� : " + result);
		showResult("�� : ");
		return result;
	}

	// ���� �޼��� (���)
	public int mul(int num1, int num2) {
		result = num1 * num2;
		// System.out.println("�� : " + result);
		showResult("�� : ");
		return result;
	}

	// ������ �޼��� (���) �������� �Ҽ������� ���;� �ϹǷ� ����!
	public double div(int num1, int num2) {
		mok = 0.0;

		if (num2 != 0) // �� �������
			mok = (double)num1 / num2; // ��ȣ �� ������ ����ȯ
		else
			System.out.println("0���� ������ �Ұ�");

		showResult("�� : ");
		// System.out.println("�� : " + mok);
		return mok;
	}

	// ���� �޼��� (���)
	public int square(int num1) {
		result = num1 * num1;
		// System.out.println("���� : " + num1);
		showResult("���� : ");
		return result;
	}

}
