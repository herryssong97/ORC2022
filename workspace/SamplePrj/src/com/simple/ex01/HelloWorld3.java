package com.simple.ex01;
		// ���
public class HelloWorld3 {
		
	public static void main(String[] args) {
		// ������ final�� �����ϸ� ���� �ٲ��� ���Ѵ�
		final int NUM = 1; // �빮�� : ��� = ������ �ʰų� ������ ���� ���� ���� ���� �ǹ�
		// System.out.println(NUM);
		
		int a = 10;
		
		// num = 10; ���� final ������ ������ �ȵ� 
		
		a = a-NUM; // �������� (���� =�ڿ� �ִ� a+NUM�� ����Ͽ� �� ���� a�� ���� ���´�)
		System.out.println("a : " +a);
		
		// a = a-NUM; // �ٷ� ���� ��꿡�� ���� a�� ������ ������ ������� �ٽ� ����� �ȴ�
		// System.out.println(a+10+ ": a��");
		
		a = a-NUM;
		System.out.println("a�� : " +(a+10));// "���ڿ�"�� ���� ������ �� ������ ���ڷ� �νĵǾ� ���� �ٿ��� ����, �� ��ȣ�� ������� ��
		System.out.println(a+10+": a��");
	}

}
