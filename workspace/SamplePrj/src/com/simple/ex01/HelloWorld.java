package com.simple.ex01;

public class HelloWorld {

	public static void main(String[] args) {
		// ������ ���� (������ �غ�)
		// ����
		int a;
		short a1;
		byte a2;
		
		// �Ǽ�
		float b1;
		double b2;
		
		char ch1;
		boolean d1;
		
		String name = "";
		
		name="ȫ�浿";
		ch1 = '��';
		
		a = 2133444;
		a1 = 234; a2 = -128;
		System.out.println("a1 �� " +a1); // �� : 234
		
		
		// b1 = 132.45f;
		b1 = (float) 132.45; // ����ȯ
		b2 = 132.45;
		
		d1 = false;
		System.out.println("d1 : "+d1); // �� : false
		
		d1 = 10 == 10; // ������ ��
		System.out.println("d1 : "+d1); // �� : true
		
		
		// �̸�, ����, Ű, ������, ����, ����
		String N1 = "";
		N1 = "������";
		
		short age;
		age = 26;
		
		short cm; 
		cm = 163;
		
		short kg;
		kg = 53;
		
		String where;
		where = "�����";
		
		System.out.println(N1);
		System.out.println(age);
		System.out.println(cm);
		System.out.println(kg);
		System.out.println(where);
	}

}











