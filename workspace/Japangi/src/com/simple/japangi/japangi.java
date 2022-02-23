package com.simple.japangi;

import java.util.Scanner;

/*
 * 
 * Ŀ�� ���Ǳ� ���α׷�
 * �ͼ�Ŀ�Ǹ𵨸�
 * �ۼ��� : ������
 * �ۼ��� : 2022-02-23 
 * 
 */
public class japangi {

	public static void main(String[] args) {
		int coin; // �Էµ� ��
		int selectMenu; // ������ �޴�

		Scanner input = new Scanner(System.in);

		menu();
		// �����Է� �ޱ�
		coin = inputCoin(input);
		System.out.println("���� : " + coin);

		selectMenu = menuSelect(input);
		System.out.println("������ �޴� : " + selectMenu);

		menuProcess(coin, selectMenu);
		// Ű���� �ڿ�����
		input.close();
	}

	private static void menuProcess(int coin, int selectMenu) {
		// Ŀ�� ó�� �޴�
		int returnMoney = 0;
		String coffee = "��";
		String message = "Ŀ�Ǹ� �޾��ּ���.";

		if (selectMenu == 1) {
			if (coin >= 300) {
				returnMoney = coin - 300;
				coffee = "��ũ";
			} else {
				returnMoney = coin;
				coffee = "";
				message = "������ ���ڶ��ϴ�.";
			}

		} else if (selectMenu == 2) {
			if (coin >= 250) {
				returnMoney = coin - 250;
				coffee = "����";
			} else {
				returnMoney = coin;
				coffee = "";
				message = "������ ���ڶ��ϴ�.";
			}

		} else if (selectMenu == 3) {
			if (coin >= 200) {
				returnMoney = coin - 200;
			} else {
				returnMoney = coin;
				coffee = "";
				message = "������ ���ڶ��ϴ�.";
			}
		} else {
			coffee = "";
			returnMoney = coin;
			message = "�ٽ� �������ּ���.";
		}

		System.out.println("Ŀ����� : " + coffee);
		System.out.println("�ܵ� : " + returnMoney);
		System.out.println("�޽��� : " + message);
	}

	private static int menuSelect(Scanner input) {
		int select;

		menu();
		System.out.println("�޴� ����[1, 2, 3] : ");

		select = input.nextInt();

		return select;
	}

	private static int inputCoin(Scanner input) {
		int coin;
		System.out.println("������ �Է� : ");

		coin = input.nextInt();

		return coin;
	}

	// ���� �Է��� ���� �޼���
	private static int inputCoin() {
		int coin;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է� : ");

		coin = input.nextInt();

		return coin;
	}

	private static void menu() {
		System.out.println("1. ��ũĿ�� : 300��");
		System.out.println("2. ����Ŀ�� : 250��");
		System.out.println("3. ��Ŀ�� : 200��");
	}

}
