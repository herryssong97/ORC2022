package com.simple.ex;
/*[����2]65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.

money = 65430��

���� = 6

õ�� = 5

��� = 4

�ʿ� = 3


*/

public class practice02 {

	public static void main(String[] args) {

		String money = "65430";
		char man = money.charAt(0);
		char mill = money.charAt(1);
		char hund = money.charAt(2);
		char ten = money.charAt(3);
		
		System.out.println("65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.");
		System.out.println("���� ="+man+" ��");
		System.out.println("õ�� ="+mill+" ��");
		System.out.println("��� ="+hund+" ��");
		System.out.println("�ʿ� ="+ten+" ��");
		
		
	}
}
