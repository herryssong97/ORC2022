package com.simple.ex01;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {

		// Ű���� �Է�
		// 1. Ű���� �Է��� ����� ��ü ����
		// 2. ������ ��ü�� �̿�

		// Ű���� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		// �Է� ������ �´� ���� �غ��ؼ� �����͸� ����
		System.out.println("���� ��(10~20)�� �Է��ϼ��� :");
		String input = keyboard.nextLine(); // => ���ڵ� ����
		// int input = keyboard.nextInt(); // => ���ڸ�

		
		System.out.println("�Է� �� :" +input);
		System.out.println("�Է� �� :" +(input+100));
		// �ϴ� �ܼ�â�� ���ڸ� �Է����ְ� �������ش�
		
		
		
	}

}
