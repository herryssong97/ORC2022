package com.simple.japangi;

import java.util.Scanner;

public class VandingMachine {

	int returnCoin;

	int coin; // �Էµ� ��
	int selectMenu; // ������ �޴�

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getCoin() {
		return coin;
	}

	public VandingMachine(int returnCoin) {
		this.returnCoin = returnCoin;
	}

	public void menuProcess(int coin, int selectMenu) {
// Ŀ�� �޴� ó��
		int returnMoney = 0;
		String coffee = "��";
		String message = "";

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
			if (coin >= 250) {
				returnMoney = coin - 250;
			} else {
				returnMoney = coin;
				coffee = "";
				message = "������ ���ڶ��ϴ�.";
			}
		} else {
			coffee = "";
			returnMoney = coin;
			message = "�޴��� �ٽü����ϼ���.";
		}

		System.out.println("Ŀ����� : " + coffee);
		System.out.println("�ܵ� : " + returnMoney);
		System.out.println("�޽��� :" + message);

	}

	public int menuSelect(Scanner input) {
		int select;

		menu();
		System.out.println("�޴� ����[1, 2, 3]: ");

		select = input.nextInt();

		return select;
	}

	public void inputCoin(Scanner input) {

		System.out.println("������ �Է�: ");

		coin += input.nextInt();
	}

	public void menu() {
		System.out.println("1. ��ũĿ��: 300��");
		System.out.println("2. ����Ŀ��: 250��");
		System.out.println("3. ��Ŀ��: 200��");
	}

}
