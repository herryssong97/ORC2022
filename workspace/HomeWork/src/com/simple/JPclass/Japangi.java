package com.simple.JPclass;

import java.util.Scanner;

public class Japangi {


	
	//public int menu;// = 0; // ��ȣ
	public int coin;// = 0; // Ŀ�ǰ���
	public int money;// = 0; // �Աݱݾ�
	public String choice = "�� �����ϼ̽��ϴ�.";
	
	public Japangi() {
		
	}
	
	////////////////////////////////////////////////////
	

	Scanner kbd = new Scanner(System.in);
	// System.out.println("�޴��� �����ϼ���. \n 1 : ��ũĿ��(300��) 2 : ����Ŀ��(200��) 3 : ��Ŀ��(250��)\n��ȣ�� �Է��� �ֹ����ּ���.");
	public int menu = kbd.nextInt(); // => ���ڸ�
	
	
	
	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		
		if (menu==1) {
		System.out.println("��ũĿ��" + choice);
		coin = 300;
		}else if(menu==2) {
		System.out.println("����Ŀ��" + choice);
		coin = 200;
		}else if(menu==3) {
		System.out.println("��Ŀ��" + choice);
		coin = 250;
		}else if(3<menu && 1>menu){
			System.out.println("1~3 ������ ���ڸ� �Է����ּ���.");
		}
		
		this.menu = menu;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getMoney() {
		
		
		return money;
	}

	public void setMoney(int money) {

		if(coin>money) {
		System.out.println("�ݾ��� �����մϴ�.");
		}else {
		System.out.println("Ŀ�Ǹ� ��������.\n�ܵ� : " + (money-coin) + "�� �Դϴ�.");
		}
		
		this.money = money;
	}

	

	
	
	
	
	
	
	
	
}
